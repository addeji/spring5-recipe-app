package com.guru.SpringRecipeApp.repositories;

import com.guru.SpringRecipeApp.domain.Category;
import com.guru.SpringRecipeApp.domain.UOM;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UOMRepository extends CrudRepository<UOM,Long> {

    Optional<UOM> findByDescription(String description);
}
