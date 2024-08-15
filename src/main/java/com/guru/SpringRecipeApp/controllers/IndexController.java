package com.guru.SpringRecipeApp.controllers;

import com.guru.SpringRecipeApp.domain.Category;
import com.guru.SpringRecipeApp.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;

    public IndexController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String getIndexPage(){
//
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        return "index";
    }
}
