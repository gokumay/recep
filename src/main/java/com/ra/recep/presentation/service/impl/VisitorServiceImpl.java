package com.ra.recep.presentation.service.impl;

import com.ra.recep.exception.ErrorCode;
import com.ra.recep.exception.RaException;
import com.ra.recep.persistence.entity.VisitorEntity;
import com.ra.recep.persistence.repository.VisitorRepository;
import com.ra.recep.presentation.service.VisitorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorServiceImpl implements VisitorService {
    private static final Logger LOGGER = LoggerFactory.getLogger(VisitorServiceImpl.class);
    private final VisitorRepository repository;

    public VisitorServiceImpl(VisitorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<VisitorEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<VisitorEntity> findByName(String name) {
        return repository.findByNameLike("%" + name + "%");
    }

    @Override
    public VisitorEntity findId(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public VisitorEntity saveOrUpdate(VisitorEntity entity) {
        try {
            LOGGER.info("[START] VisitorServiceImpl saveOrUpdate");
            repository.save(entity);
            LOGGER.info("[END] VisitorServiceImpl saveOrUpdate success");
            return entity;
        } catch (Exception ex) {
            LOGGER.error("[EXCEPTION] VisitorServiceImpl saveOrUpdate with ex: {}", ex);
            throw new RaException(ErrorCode.SQL_ERROR);
        }
    }

    @Override
    public VisitorEntity remove(String id) {
        try {
            VisitorEntity entity = findId(id);
            repository.delete(entity);
            return entity;
        } catch (Exception ex) {
            throw new RaException(ErrorCode.SQL_ERROR);
        }
    }
}