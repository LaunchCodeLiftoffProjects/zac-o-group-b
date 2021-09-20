package com.savegreen.controllers;
import com.savegreen.data.RecipeRepository;
import com.savegreen.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("recipe")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("")
    public String recipe (Model model){
        model.addAttribute("title", "Recipes");
        model.addAttribute("recipes", recipeRepository.findAll());
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
        return "recipe/add";
    }

    @PostMapping("add")
    public String processAddEmployerForm(@ModelAttribute @Valid Recipe newRecipe,
                                         Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "recipe/add";
        }
        recipeRepository.save(newRecipe);
        return "redirect:";
    }

}
