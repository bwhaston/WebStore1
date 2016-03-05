package com.example;

import java.util.HashSet;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebStoreController
{
    HashSet<Product> products = new HashSet<Product>();



    @RequestMapping("/items")
    public HashSet<Product> getItems()
    {
        return this.products;
    }
}
