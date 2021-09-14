package org.launchcode.recipeapp.controllers;
import org.launchcode.recipeapp.models.Recipe;
import org.launchcode.recipeapp.models.RecipeIngredient;
import org.launchcode.recipeapp.models.data.IngredientRepository;
import org.launchcode.recipeapp.models.data.RecipeIngredientRepository;
import org.launchcode.recipeapp.models.data.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.validation.Valid;
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

        //model.addAttribute("title", "Recipe Application");
        model.addAttribute("title", ingredient_id);
        model.addAttribute("ingredients", ingredientRepository.findAll());

        model.addAttribute("recipeIngre",recipeIngredientRepository.findById(ingredient_id));

        //Optional optRecipeIngredient =  recipeIngredientRepository.findById(ingredient_id);

        //Optional optRecipeIngredient = recipeIngredientRepository.findByIngredient_ID_R(ingredient_id);

        //RecipeIngredientRepository optRecipeIngredient = recipeIngredientRepository.findByIngredient_ID_R(ingredient_id);


        //RecipeIngredient recipeIngredient = (RecipeIngredient) optRecipeIngredient.get();

        //optRecipeIngredient.


        return "recipe/index";

//        if (optRecipeIngredient.isPresent()) {
//            RecipeIngredient recipeIngredient = (RecipeIngredient) optRecipeIngredient.get();
//
//            Optional optRecipe = recipeRepository.findById(recipeIngredient.getRecipe_id_r());
//            if (optRecipe.isPresent()) {
//                Recipe recipe = (Recipe) optRecipe.get();
//                model.addAttribute("recipes", recipe);
//                return "recipe/index";
//            } else {
//                return "redirect:../";
//            }
//
//        } else {
//            model.addAttribute("recipes", recipeRepository.findAll());
//            return "recipe/index";
//            //return "redirect:../";
//        }
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
    public String processAddEmployerForm(@ModelAttribute @Valid Recipe newRecipe, RecipeIngredient newRecipeIngredient,
                                         Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "recipe/add";
        }
        recipeRepository.save(newRecipe);
        newRecipeIngredient.setRecipe_id_r(newRecipe.getRecipe_id());
        recipeIngredientRepository.save(newRecipeIngredient);
        return "redirect:";
    }

}
