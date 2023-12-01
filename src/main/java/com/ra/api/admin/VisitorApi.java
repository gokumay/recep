package com.ra.api.admin;


import com.ra.model.admin.Visitor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/visitors/add")
public class VisitorApi {

    @GetMapping
    public Visitor getVisitor() {
        Visitor v = new Visitor();

        return v;
    }
}
