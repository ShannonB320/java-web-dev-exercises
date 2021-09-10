package org.launchcode.java.studios.restaurentmenu;


public class MenuItem {

    public String itemName;
    public double itemPrice;
    public String itemDescription;


    //constructor:
    public MenuItem(String name, double price, String description) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemDescription = description;
    }

    //setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }


    //getters
    public String getItemName() {
        return this.itemName;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }



}
