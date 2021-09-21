package com.savegreen.controllers;

import com.savegreen.data.IngredientRepository;
import com.savegreen.data.RecipeIngredientRepository;
import com.savegreen.data.RecipeRepository;
import com.savegreen.models.Recipe;
import com.savegreen.models.RecipeIngredient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("recipe")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private RecipeIngredientRepository recipeIngredientRepository;

    @GetMapping("")
    public String recipe (Model model){
        model.addAttribute("title", "Recipe Application");
        model.addAttribute("recipes", recipeRepository.findAll());
        model.addAttribute("ingredients", ingredientRepository.findAll());
        return "recipe/index";
    }

    @GetMapping("/{ingredient_id}")
    public String recipeSelected (Model model,@PathVariable int ingredient_id){
        model.addAttribute("ingredients", ingredientRepository.findAll());
        List <RecipeIngredient> lstRecipeIngredient = (List<RecipeIngredient>) recipeIngredientRepository.findByIngredientid(ingredient_id);
        //String lstRecipeIngredientIds = "";
        ArrayList<Integer> recipeIdList = new ArrayList<Integer>();
        for (int i =0; i<lstRecipeIngredient.size();i++){
            //lstRecipeIngredientIds += " ===> " + lstRecipeIngredient.get(i).getRecipeid().toString();
            recipeIdList.add(lstRecipeIngredient.get(i).getRecipeid());
        }
        model.addAttribute("recipes",recipeRepository.findByRecipeIdIn(recipeIdList));
        model.addAttribute("ingredientID",ingredient_id);
        //model.addAttribute("title", String.valueOf(ingredient_id) + lstRecipeIngredientIds + recipeIdList.toString() + "===>>>>>>>");
        return "recipe/index";
    }

    @GetMapping("view/{recipe_id}")
    public String displayViewRecipe (Model model, @PathVariable int recipe_id){

        Optional optRecipe = recipeRepository.findById(recipe_id);

        if (optRecipe.isPresent()) {
            Recipe recipe = (Recipe) optRecipe.get();
            model.addAttribute("recipes", recipe);
            return "recipe/view";
        } else {
            return "redirect:../";
        }
    }

    @GetMapping("add")
    public String displayAddRecipeForm (Model model){
        model.addAttribute(new Recipe());
        model.addAttribute(new RecipeIngredient());
        model.addAttribute("ingredients", ingredientRepository.findAll());
        return "recipe/add";
    }

    @PostMapping("add")
    public String processAddRecipeForm(@ModelAttribute @Valid Recipe newRecipe, RecipeIngredient newRecipeIngredient,
                                         Errors errors, Model model,@RequestParam(required = true) int[] ingredientIds) {

        if (errors.hasErrors()) {
            return "recipe/add";
        }
        recipeRepository.save(newRecipe);
        int iRecipeId = newRecipe.getRecipeId();
        //newRecipeIngredient.setRecipeid(newRecipe.getRecipeId());
        //recipeIngredientRepository.save(newRecipeIngredient);
        for (int i=0; i<ingredientIds.length;i++){
            RecipeIngredient ri = new RecipeIngredient();
            ri.setRecipeid(iRecipeId);
            ri.setIngredientid(ingredientIds[i]);
            recipeIngredientRepository.save(ri);
        }

        return "redirect:";
    }

    @PostMapping("delete")
    public String processDeleteRecipeForm(@RequestParam(required = true) int[] deleteRecipeId, Model model) {

        for (int i=0; i<deleteRecipeId.length;i++){
            recipeRepository.deleteById(deleteRecipeId[i]);
            recipeIngredientRepository.deleteByRecipeid(deleteRecipeId[i]);
        }
        model.addAttribute("deleteMessage", "Selected Recipe Deleted !!!");

        return "redirect:";
    }

}
