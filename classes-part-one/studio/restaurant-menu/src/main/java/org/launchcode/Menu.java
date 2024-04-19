package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Menu {

    //private Date dateLastUpdated;
    private ArrayList<String> categories = new ArrayList<>(
            Arrays.asList("Appetizer","Main Course","Dessert"));


    private MenuItem special;
    private ArrayList<MenuItem> menuItems;

    public Menu(ArrayList<MenuItem> items){
        this.menuItems = items;
        //this.dateLastUpdated = new Date();
    }

    public void addMenuItem(MenuItem item){
        this.menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item){
        this.menuItems.remove(item);
    }


    public void addCategory(String category){
        this.categories.add(category);
    }

    public void removeCategory(String category){
        this.categories.remove(category);
    }

    public MenuItem getSpecial() {
        return special;
    }


    public void setSpecial(MenuItem special) {
        this.special = special;
    }



    public void printMenu(){
       System.out.println("##############");
        for(MenuItem menuItem : menuItems){
            System.out.println(menuItem.toString());
            System.out.println("##############");
        }
   }

    public void printCategory(String category){
        System.out.println("##############");
        System.out.println("Category:"+category);
        ArrayList<MenuItem> itemsOnCategory = new ArrayList<>();
            for(MenuItem menu : menuItems){
                 if(menu.getCategory().equals(category)){
                     System.out.println(menu);
                 }
            }
        System.out.println("##############");

        }

    public void findNewOrOldMenu(ArrayList<MenuItem> oldMenuList, MenuItem sameMenu){
        for(MenuItem menu : oldMenuList){
            if(sameMenu.equals(menu)){
                System.out.println("Same");

            }
        }
    }

    }



