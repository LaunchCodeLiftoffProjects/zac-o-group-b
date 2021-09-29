package com.savegreen.controllers;
import com.savegreen.data.IngredientRepository;
import com.savegreen.models.Ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
