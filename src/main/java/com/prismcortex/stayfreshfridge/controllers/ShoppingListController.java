package com.prismcortex.stayfreshfridge.controllers;

<<<<<<< HEAD:src/main/java/com/prismcortex/stayfreshfridge/controllers/ShoppingListController.java
import com.prismcortex.stayfreshfridge.data.ShoppingListData;
import com.prismcortex.stayfreshfridge.models.Fridge;
import com.prismcortex.stayfreshfridge.models.GroceryItem;
=======
import com.savegreen.data.FridgeRepository;
import com.savegreen.data.GroceryItemRepository;
import com.savegreen.data.ShoppingListData;
import com.savegreen.models.Fridge;
import com.savegreen.models.FridgeItem;
import com.savegreen.models.GroceryItem;
>>>>>>> origin/new-n8:src/main/java/com/savegreen/controllers/ShoppingListController.java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD:src/main/java/com/prismcortex/stayfreshfridge/controllers/ShoppingListController.java
=======
import javax.validation.Valid;
import java.util.Optional;

>>>>>>> origin/new-n8:src/main/java/com/savegreen/controllers/ShoppingListController.java
@RequestMapping("shoppinglist")
@Controller
public class ShoppingListController {

<<<<<<< HEAD:src/main/java/com/prismcortex/stayfreshfridge/controllers/ShoppingListController.java
    @GetMapping
=======
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    @Autowired
    private FridgeRepository fridgeRepository;

    @GetMapping("")
>>>>>>> origin/new-n8:src/main/java/com/savegreen/controllers/ShoppingListController.java
    public String displayShoppingList(Model model) {
        model.addAttribute("title", "Shopping List");
        model.addAttribute("shoppingList", ShoppingListData.getShoppingList());
        return "shoppinglist/shoppinglist";
    }
    @PostMapping
    public String createGroceryItem(@RequestParam String name, @RequestParam String expires,
                                    Model model) {
<<<<<<< HEAD:src/main/java/com/prismcortex/stayfreshfridge/controllers/ShoppingListController.java
        ShoppingListData.add(new GroceryItem(name, expires));

=======
        if (errors.hasErrors()) {
            return "shoppinglist/index";
        }
        groceryItemRepository.save(newGroceryItem);
>>>>>>> origin/new-n8:src/main/java/com/savegreen/controllers/ShoppingListController.java
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
        model.addAttribute(new FridgeItem());
        return "shoppinglist/move";
    }

    @PostMapping("move")
    public String moveToFridge(@ModelAttribute @Valid FridgeItem newFridgeItem,
                               @RequestParam(required = false) int itemId) {

        fridgeRepository.save(newFridgeItem);
        groceryItemRepository.deleteById(itemId);

//        Optional optMoveItem = groceryItemRepository.findById(item);
//        if (optMoveItem.isPresent()) {
//            GroceryItem fridgeItem = (GroceryItem) optMoveItem.get();
//            FridgeItem newFridgeItem = new FridgeItem(moveItem.getName(), expires);
//            fridgeRepository.save(newFridgeItem);
//            groceryItemRepository.deleteById(item);
//        }
        return "redirect:move";
    }



}
