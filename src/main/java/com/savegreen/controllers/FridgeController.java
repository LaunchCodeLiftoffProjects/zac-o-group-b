package com.savegreen.controllers;

import com.savegreen.data.GroceryItemRepository;
import com.savegreen.models.GroceryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

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
    public String setUseByDate(@ModelAttribute @Valid GroceryItem newGroceryItem, Errors errors,
                               @RequestParam(required = false) String fridgeName, @RequestParam(required = false) String useByDate, Model model) {

        newGroceryItem.setName(fridgeName);
        newGroceryItem.setExpires(useByDate);
        groceryItemRepository.save(newGroceryItem);
        return "redirect:";
    }
}
