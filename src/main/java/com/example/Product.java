package com.example;

public class Product
{
    private String productName;
    private String productDescription;
    private long id;
    private int price;

    /*
    public Product(String productName, String productDescription, long id, int price)
    {
        this.productName = productName;
        this.productDescription = productDescription;
        this.id = id;
        this.price = price;
    }
    */

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

    public void setProductName(String newName)
    {
        this.productName = newName;
    }

    public void setProductDescription(String newDescription)
    {
        this.productDescription = newDescription;
    }

    public void setId(long newId)
    {
        this.id = newId;
    }

    public void setPrice(int newPrice)
    {
        this.price = newPrice;
    }
}
