package com.guru.SpringRecipeApp.services;

import com.guru.SpringRecipeApp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
