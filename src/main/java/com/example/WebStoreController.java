package com.example;

import java.util.HashSet;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebStoreController
{
    HashSet<Product> products = new HashSet<Product>();

    HashSet<Order> orders = new HashSet<Order>();

    @RequestMapping("/items")
    public HashSet<Product> getItems()
    {
        Product p = new Product("iMac", "This is a really nice computer", 10, 20);
        this.products.add(p);
        return this.products;
    }

    @RequestMapping("/orders")
    public HashSet<Order> getOrders()
    {
        Product p1 = new Product("Windows Box", "This is an average computer", 25, 35);
        Order o = new Order(200, p1);
        this.orders.add(o);
        return this.orders;
    }
}
