package com.ra.service;

import com.ra.model.admin.Visitor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VisitorService {
    List<Visitor> getAllVisitors();

    Visitor getVisitorById(String id);

    Visitor addVisitor(Visitor visitor);

    Visitor updateVisitor(String id, Visitor updatedVisitor);

    boolean deleteVisitor(String id);
}
