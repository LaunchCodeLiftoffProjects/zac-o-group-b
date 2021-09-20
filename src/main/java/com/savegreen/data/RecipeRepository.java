package com.savegreen.data;

import com.savegreen.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RecipeRepository extends CrudRepository <Recipe, Integer> {
}
