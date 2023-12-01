package com.ra.controller;

import com.ra.model.admin.Visitor;
import com.ra.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VisitorController {

    private final VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @GetMapping("/visitor")
    public String showVisitorList(Model model) {
        List<Visitor> visitors = visitorService.getAllVisitors();
        model.addAttribute("visitor", visitors);
        return "visitor";
    }
}
