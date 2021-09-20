package org.launchcode.recipeapp.models.data;

import org.launchcode.recipeapp.models.RecipeIngredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, Integer> {
    List<RecipeIngredient> findByIngredientid(int ingredient_id);
    long deleteByRecipeid(int recipeid);
}
