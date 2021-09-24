package com.savegreen.controllers;

import com.savegreen.data.FridgeRepository;
import com.savegreen.data.GroceryItemRepository;
import com.savegreen.data.ShoppingListData;
import com.savegreen.models.Fridge;
import com.savegreen.models.GroceryItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RequestMapping("shoppinglist")
@Controller
public class ShoppingListController {

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    @Autowired
    private FridgeRepository fridgeRepository;

    @GetMapping("")
    public String displayShoppingList(Model model) {
        model.addAttribute("title", "Shopping List");
        model.addAttribute("groceryItems", groceryItemRepository.findAll());
        model.addAttribute(new GroceryItem());
        return "shoppinglist/index";
    }
    @PostMapping
    public String createGroceryItem(@ModelAttribute @Valid GroceryItem newGroceryItem, Errors errors,
                                    Model model) {
        if (errors.hasErrors()) {
            return "shoppinglist/index";
        }
        groceryItemRepository.save(newGroceryItem);
        return "redirect:shoppinglist";
    }

    @RequestMapping("delete")
    @GetMapping("delete")
    public String displayDeleteList(Model model) {
        model.addAttribute("title", "Delete Item");
        model.addAttribute("shoppingList", groceryItemRepository.findAll());
        return "shoppinglist/delete";
    }

    @PostMapping("delete")
    public String deleteItems(@RequestParam(required = false) int[] itemIds) {
        if(itemIds != null) {
            for(int id : itemIds) {
                groceryItemRepository.deleteById(id);
            }
        }

        return "redirect:delete";
    }

    @RequestMapping("move")
    @GetMapping
    public String displayMoveToFridge(Model model) {
        model.addAttribute("title", "Move To Fridge");
        model.addAttribute("shoppingList", groceryItemRepository.findAll());
        return "shoppinglist/move";
    }

    @PostMapping("move")
    public String moveToFridge(@RequestParam(required = false) int[] items, @RequestParam String expires, Model model) {

        if(items != null) {
            for(int item : items) {
                Optional optFridgeItem = groceryItemRepository.findById(item);
                if (optFridgeItem.isPresent()) {
                    GroceryItem fridgeItem = (GroceryItem) optFridgeItem.get();
                    fridgeItem.setName(fridgeItem.getName());
                    fridgeItem.setExpires(expires);
                    fridgeRepository.save(fridgeItem);
                    groceryItemRepository.delete(fridgeItem);
                }

            }

        }
        return "redirect:move";
    }



}
