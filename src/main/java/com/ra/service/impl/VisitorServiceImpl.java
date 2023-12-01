package com.ra.service.impl;

import com.ra.service.VisitorService;
import com.ra.repository.VisitorRepository;
import com.ra.model.admin.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public abstract class VisitorServiceImpl implements VisitorService {

    private final VisitorRepository visitorRepository;

    public VisitorServiceImpl(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    @Override
    public List<Visitor> getAllVisitors() {
        return visitorRepository.visitorRepository();
    }


}