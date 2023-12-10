package com.ra.recep.presentation.api.admin;


import com.ra.recep.persistence.entity.VisitorEntity;
import com.ra.recep.presentation.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitors")
@CrossOrigin
public class VisitorApi {
    @Autowired
    private VisitorService visitorService;

    @GetMapping
    public List<VisitorEntity> get() {
        return visitorService.findAll();
    }
    @GetMapping("/{id}")
    public VisitorEntity get(@PathVariable String id) {
        return visitorService.findId(id);
    }
    @PostMapping
    public VisitorEntity post(@RequestBody VisitorEntity entity) {
        return visitorService.saveOrUpdate(entity);
    }
    @PutMapping("/{id}")
    public VisitorEntity put(@PathVariable String id, @RequestBody VisitorEntity entity) {
        return visitorService.saveOrUpdate(entity);
    }
    @DeleteMapping("/{id}")
    public VisitorEntity delete(@PathVariable String id) {
        return visitorService.findId(id);
    }
}
