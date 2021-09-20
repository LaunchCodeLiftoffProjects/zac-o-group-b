package com.savegreen.controllers;

import com.savegreen.data.GroceryItemRepository;
import com.savegreen.models.GroceryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("fridge")
@Controller
public class FridgeController {

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    @GetMapping("")
    public String displayFridgeList(Model model) {
        model.addAttribute("title", "Fridge");
        model.addAttribute("fridgeItems", groceryItemRepository.findAll());

        return "fridge/index";
    }

    @PostMapping("")
    public String setUseByDate(@ModelAttribute @Valid GroceryItem newGroceryItem, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "fridge/index";
        }

        groceryItemRepository.save(newGroceryItem);
        return "redirect: ";
    }
}
