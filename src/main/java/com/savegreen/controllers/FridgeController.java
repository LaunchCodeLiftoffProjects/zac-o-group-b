package com.savegreen.controllers;

import com.savegreen.data.FridgeRepository;
import com.savegreen.data.GroceryItemRepository;
import com.savegreen.models.FridgeItem;
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
    @Autowired
    private FridgeRepository fridgeRepository;

    @GetMapping("")
    public String displayFridgeList(Model model) {
        model.addAttribute("title", "Fridge");
        model.addAttribute("fridgeItems", fridgeRepository.findAll());
        model.addAttribute(new FridgeItem());

        return "fridge/index";
    }

    @PostMapping("")
    public String createFridgeItem(@ModelAttribute @Valid FridgeItem newFridgeItem, Errors errors,
                                   Model model) {
        if(errors.hasErrors()){
            return "fridge/index";
        }
        fridgeRepository.save(newFridgeItem);
        return "redirect:fridge";
    }

    @RequestMapping("delete")
    @GetMapping("delete")
    public String displayDeleteList(Model model) {
        model.addAttribute("title", "Delete Item");
        model.addAttribute("fridgeList", fridgeRepository.findAll());
        return "fridge/delete";
    }

    @PostMapping("delete")
    public String deleteItems(@RequestParam(required = false) int[] itemIds) {
        if(itemIds != null) {
            for(int id : itemIds) {
                fridgeRepository.deleteById(id);
            }
        }

        return "redirect:delete";
    }
}
