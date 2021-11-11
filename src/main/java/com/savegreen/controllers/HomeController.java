package com.savegreen.controllers;
import com.savegreen.models.GroceryItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("")
    public String index (Model model){
        model.addAttribute("title", "Save Green");
        model.addAttribute(new GroceryItem());
        return "shoppinglist/index";
    }
    @RequestMapping("home")
    public String home (Model model){
        model.addAttribute("title", "Save Green");
        model.addAttribute(new GroceryItem());
        return "shoppinglist/index";
    }
}
