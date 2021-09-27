package org.launchcode.recipeapp.models.data;

import org.launchcode.recipeapp.models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IngredientRepository extends CrudRepository <Ingredient, Integer> {
}
