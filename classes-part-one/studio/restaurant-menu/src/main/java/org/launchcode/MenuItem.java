package org.launchcode;

import java.util.Date;
import java.util.Objects;

public class MenuItem {

    private double price;
    private String name;
    private String description;
    private String category;
    private Date dateCreated;

    private boolean isNew;

    public MenuItem(double price, String name, String description, String category, boolean isNew, Date dateCreated) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.dateCreated = dateCreated;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew(){
        return isNew;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString() {
        return  " Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                "Price=" + price ;
    }

@Override
   public boolean equals(Object otherItem){
        if(this == otherItem){
            return true;
        }
        if(otherItem == null){
            return false;
        }
        MenuItem menuItem = (MenuItem) otherItem;
        return Objects.equals(name,menuItem.name) &&
                Objects.equals(category,menuItem.category) &&
                Objects.equals(isNew, menuItem.isNew);
    }
}
