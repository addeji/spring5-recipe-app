package com.guru.SpringRecipeApp.controllers;

import com.guru.SpringRecipeApp.domain.Category;
import com.guru.SpringRecipeApp.repositories.CategoryRepository;
import com.guru.SpringRecipeApp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
        private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipe",recipeService.getRecipes());
//
        return "index";
    }
}
