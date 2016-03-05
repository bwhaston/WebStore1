package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebStoreController
{
    int[] nums = {1, 2, 3, 4, 5};

    @RequestMapping("/items")
    public int[] showNums()
    {
        return this.nums;
    }
}
