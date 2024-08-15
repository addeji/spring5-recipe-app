package com.guru.SpringRecipeApp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ingredients {
    private String description;;
    private BigDecimal amount;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Recipe recipe;

    @OneToOne(fetch = FetchType.EAGER)
    private UOM uom;

    public Ingredients(String ripeAvocados, BigDecimal bigDecimal, UOM eachUom, Recipe guacRecipe) {

    }
}
