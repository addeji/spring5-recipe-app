package com.guru.SpringRecipeApp.repositories;

import com.guru.SpringRecipeApp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
