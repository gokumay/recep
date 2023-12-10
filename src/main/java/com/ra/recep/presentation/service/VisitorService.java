package com.ra.recep.presentation.service;

import com.ra.recep.persistence.entity.VisitorEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VisitorService {
    List<VisitorEntity> findAll();
    List<VisitorEntity> findByName(String name);
    VisitorEntity findId(String id);
    VisitorEntity saveOrUpdate(VisitorEntity entity);
    VisitorEntity remove(String id);
}
