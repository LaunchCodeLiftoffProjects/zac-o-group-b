package com.prismcortex.stayfreshfridge.controllers;

import com.prismcortex.stayfreshfridge.data.ShoppingListData;
import com.prismcortex.stayfreshfridge.models.GroceryItem;
import com.prismcortex.stayfreshfridge.models.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShoppingListController {

    @RequestMapping("shoppinglist")
    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "Shopping List");
        model.addAttribute("shoppingList", ShoppingListData.getAll());
        return "shoppinglist";
    }
    @PostMapping("shoppinglist")
    public String createGroceryItem(@RequestParam String itemName, @RequestParam String expires, Model model) {
        model.addAttribute("title", "Shopping List");
        ShoppingListData.add(new GroceryItem(itemName, expires));
        return "redirect:shoppinglist";
    }


}
