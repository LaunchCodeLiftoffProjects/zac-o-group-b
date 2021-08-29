package com.prismcortex.stayfreshfridge.controllers;

import com.prismcortex.stayfreshfridge.data.ShoppingListData;
import com.prismcortex.stayfreshfridge.models.GroceryItem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShoppingListController {


    @RequestMapping("shoppinglist")
    @GetMapping
    public String displayShoppingList(Model model) {
        model.addAttribute("title", "Shopping List");
        model.addAttribute("shoppingList", ShoppingListData.getShoppingList());
        return "shoppinglist";
    }
    @PostMapping("shoppinglist")
    public String createGroceryItem(@RequestParam String name, @RequestParam (required = false) Integer expires,
                                    @RequestParam (required = false) GroceryItem groceryItem, Model model) {
        model.addAttribute("title", "Shopping List");
        ShoppingListData.add(new GroceryItem(name, expires));

        return "redirect:shoppinglist";
    }

    @GetMapping("delete")
    public String displayDeleteList(Model model) {
        model.addAttribute("title", "Shopping List");
        model.addAttribute("shoppingList", ShoppingListData.getShoppingList());
        return "delete";
    }

    @PostMapping("delete")
    public String deleteItems(@RequestParam(required = false) int[] itemIds) {
        if(itemIds != null) {
            for(int id : itemIds) {
                ShoppingListData.remove(id);
            }
        }

        return "redirect:shoppinglist";
    }

}
