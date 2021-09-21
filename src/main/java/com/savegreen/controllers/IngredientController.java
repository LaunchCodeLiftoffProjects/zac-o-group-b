package org.launchcode.recipeapp.controllers;
import org.launchcode.recipeapp.models.Ingredient;
import org.launchcode.recipeapp.models.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("ingredients")

public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("")
    public String displayIngredientForm(Model model){
        model.addAttribute("title", "Recipe Application");
        model.addAttribute("ingredients", ingredientRepository.findAll());
        return "ingredients/index";
    }

    @GetMapping("add")
    public String displayAddIngredientForm (Model model){
        model.addAttribute(new Ingredient());
        return "ingredients/add";
    }

    @PostMapping("add")
    public String saveIngredient(@ModelAttribute @Valid Ingredient newIngredient,
                                 Errors errors, Model model){
        if (errors.hasErrors()) {
            return "ingredients/add";
        }
        ingredientRepository.save(newIngredient);
        return "redirect:";
    }
}
