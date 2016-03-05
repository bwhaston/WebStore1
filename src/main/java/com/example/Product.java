package com.example;

public class Product
{
    public String productName;
    public String productDescription;
    public long id;
    public int price;

    public Product(String productName, String productDescription, long id, int price)
    {
        this.productName = productName;
        this.productDescription = productDescription;
        this.id = id;
        this.price = price;
    }

    public String getProductName()
    {
        return this.productName;
    }

    public String getProductDescription()
    {
        return this.productDescription;
    }

    public long getId()
    {
        return this.id;
    }

    public int getPrice()
    {
        return this.price;
    }
}
