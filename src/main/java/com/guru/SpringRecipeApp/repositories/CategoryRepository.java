package com.guru.SpringRecipeApp.repositories;

import com.guru.SpringRecipeApp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long>{
}
