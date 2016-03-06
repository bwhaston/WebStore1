package com.example;

import java.util.HashSet;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

//@RestController
@Controller
public class WebStoreController
{
    HashSet<Product> products = new HashSet<Product>();
    HashSet<Order> orders = new HashSet<Order>();

    @RequestMapping(value="/home", method=RequestMethod.GET)
    public String homePage(Model model)
    {
        model.addAttribute("Product", new Product());
        return "HomeScreen";
    }

    @RequestMapping(value="/items", method=RequestMethod.GET)
    public HashSet<Product> getItems()
    {
        Product p = new Product();
        this.products.add(p);
        return this.products;
    }

    @RequestMapping(value="/orders", method=RequestMethod.GET)
    public HashSet<Order> getOrders()
    {
        Product p1 = new Product();
        Order o = new Order(200, p1);
        this.orders.add(o);
        return this.orders;
    }
}
