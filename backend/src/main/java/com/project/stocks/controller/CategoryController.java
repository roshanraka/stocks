package com.project.stocks.controller;

import com.project.stocks.dto.Category;
import com.project.stocks.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/stock/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/{category}")
    public Category getCategoryDetails(@PathVariable(value = "category") String category){
        return categoryService.getCategoryDetails(category);
    }

    @GetMapping(value = "/")
    public List<String> getCategoryNames(){
        return categoryService.getCategoryNames();
    }

}