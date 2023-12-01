package com.ra.api.admin;


import com.ra.model.admin.Category;
import com.ra.model.admin.Visitor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories/add")
public class CategoryApi {

    @GetMapping
    public Category getCategory() {
        Category c = new Category();
        c.setCategory_name("Partner");
        return c;
    }
}
