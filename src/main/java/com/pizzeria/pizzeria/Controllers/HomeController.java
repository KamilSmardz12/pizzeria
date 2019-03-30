package com.pizzeria.pizzeria.Controllers;

import com.pizzeria.pizzeria.Item.Item;
import com.pizzeria.pizzeria.Item.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private ItemRepository itemRepository;

    public HomeController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Item> items = (List<Item>) itemRepository.findAll();
        model.addAttribute("items", items);
        return "index";
    }
}