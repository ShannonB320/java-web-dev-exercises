package org.launchcode.java.studios.restaurentmenu;
import java.util.Date;
import java.util.Objects;


public class MenuItem {

    public String itemName;
    public double itemPrice;
    public String itemDescription;
    public String itemCategory;
    public Date creationDate;
    public boolean isNew = false;


    //constructor:
    public MenuItem(String name, double price, String description, String category) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemDescription = description;
        this.itemCategory = category;
        this.creationDate = new Date();
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

    //special methods
    @Override
    public String toString() {
        return itemName + " | " + itemDescription + ", " + itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return itemName.equals(menuItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName);
    }


}
