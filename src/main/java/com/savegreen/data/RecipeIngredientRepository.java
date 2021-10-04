package com.savegreen.data;

import com.savegreen.models.RecipeIngredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, Integer> {
    List<RecipeIngredient> findByIngredientid(int ingredient_id);
    long deleteByRecipeid(int recipeid);
    long deleteByIngredientid(int ingredient_id);
}
