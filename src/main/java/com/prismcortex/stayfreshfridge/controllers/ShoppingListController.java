package com.prismcortex.stayfreshfridge.controllers;

import com.prismcortex.stayfreshfridge.data.ShoppingListData;
import com.prismcortex.stayfreshfridge.models.Fridge;
import com.prismcortex.stayfreshfridge.models.GroceryItem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("shoppinglist")
@Controller
public class ShoppingListController {

    @GetMapping
    public String displayShoppingList(Model model) {
        model.addAttribute("title", "Shopping List");
        model.addAttribute("shoppingList", ShoppingListData.getShoppingList());
        return "savegreen/shoppinglist/shoppinglist";
    }
    @PostMapping
    public String createGroceryItem(@RequestParam String name, @RequestParam (required = false) String expires,
                                    Model model) {
        ShoppingListData.add(new GroceryItem(name, expires));

        return "redirect:shoppinglist";
    }
    @RequestMapping("delete")
    @GetMapping("delete")
    public String displayDeleteList(Model model) {
        model.addAttribute("title", "Delete Item");
        model.addAttribute("shoppingList", ShoppingListData.getShoppingList());
        return "savegreen/shoppinglist/delete";
    }

    @PostMapping("delete")
    public String deleteItems(@RequestParam(required = false) int[] itemIds) {
        if(itemIds != null) {
            for(int id : itemIds) {
                ShoppingListData.remove(id);
            }
        }

        return "redirect:delete";
    }

    @RequestMapping("move")
    @GetMapping
    public String displayMoveToFridge(Model model) {
        model.addAttribute("title", "Move To Fridge");
        model.addAttribute("shoppingList", ShoppingListData.getShoppingList());
        return "savegreen/shoppinglist/move";
    }

    @PostMapping("move")
    public String moveToFridge(@RequestParam(required = false) int[] items) {
        if(items != null) {
            for(int item : items) {
                Fridge.add(ShoppingListData.getById(item));
                ShoppingListData.remove(item);
            }

        }
        return "redirect:move";
    }



}
