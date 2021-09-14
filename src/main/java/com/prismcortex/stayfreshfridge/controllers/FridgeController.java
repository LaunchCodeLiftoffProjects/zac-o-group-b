package com.prismcortex.stayfreshfridge.controllers;

import com.prismcortex.stayfreshfridge.data.ShoppingListData;
import com.prismcortex.stayfreshfridge.models.Fridge;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("fridge")
@Controller
public class FridgeController {

    @GetMapping
    public String displayShoppingList(Model model) {
        model.addAttribute("title", "Fridge");
        model.addAttribute("fridge", Fridge.getFridgeList());
        return "savegreen/fridge/fridge";
    }
}
