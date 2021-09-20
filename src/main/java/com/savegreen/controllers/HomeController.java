package com.savegreen.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("")
    public String index (Model model){
        model.addAttribute("title", "Recipe Application");
        return "index";
    }
    @RequestMapping("home")
    public String home (Model model){
        model.addAttribute("title", "Recipe Application");
        return "index";
    }
}
