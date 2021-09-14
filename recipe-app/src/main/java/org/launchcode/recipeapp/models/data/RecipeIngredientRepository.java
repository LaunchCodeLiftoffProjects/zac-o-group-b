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

    //Optional<RecipeIngredientRepository> findByIngredient_ID_R(int ingredient_id);
    //RecipeIngredientRepository findByIngredient_ID_R(int ingredient_id);
}
