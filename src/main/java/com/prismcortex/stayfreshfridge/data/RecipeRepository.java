package com.prismcortex.stayfreshfridge.data;

import com.prismcortex.stayfreshfridge.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface RecipeRepository extends CrudRepository <Recipe, Integer> {
    Iterable<Recipe> findByRecipeIdIn(List<Integer> recipeIdList);
}
