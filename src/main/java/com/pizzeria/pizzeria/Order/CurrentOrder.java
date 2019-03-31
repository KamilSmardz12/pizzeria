package com.pizzeria.pizzeria.Order;

import com.pizzeria.pizzeria.Item.Item;
import com.pizzeria.pizzeria.Item.ItemController;
import com.pizzeria.pizzeria.Item.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Controller
public class CurrentOrder {

    List<Item> pizzasInOrder = new ArrayList<>();
    private ItemRepository itemRepository;

    public CurrentOrder(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/order")
    public String getItem(@RequestParam String name, Model model) {
        pizzasInOrder.add(itemRepository.findByNameIgnoreCase(name).get());
        model.addAttribute("order",pizzasInOrder);
        return "redirect:/";
    }

}
