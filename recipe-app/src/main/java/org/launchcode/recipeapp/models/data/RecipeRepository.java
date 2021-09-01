package org.launchcode.recipeapp.models.data;

import org.launchcode.recipeapp.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RecipeRepository extends CrudRepository <Recipe, Integer> {
}
