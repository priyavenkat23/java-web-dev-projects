package org.launchcode;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {


	// write your code here


        ArrayList<MenuItem> menuItem = new ArrayList<>(
                Arrays.asList(
                        new MenuItem(2.50,
                                     "Fries",
                                    "Potato Finger Fries",
                                      "Appetizer", false,new Date(20230101)),
                        new MenuItem(4.50,
                                "Nuggets",
                                "Chicken Nuggets",
                                "Appetizer", false,new Date(20230101)),
                        new MenuItem(5.75,
                                "Pasta",
                                "White sauce pasta",
                                "Main Course",false,new Date(20240102))));
        Menu menu = new Menu(menuItem);
        menu.addMenuItem(new MenuItem(
                8.25,"Cake","Chocolate Fudge","Dessert",true, new Date() ));

        menu.printMenu();

        //To check based on category
        menu.printCategory("Appetizer");

        // To check the menu is new or old
        Menu sameMenu = new Menu(menuItem);
        sameMenu.setSpecial(new MenuItem(
                9.25,"Pasta","Pasta with white sauce","Main Course",true, new Date() ));



        sameMenu.findNewOrOldMenu(menuItem, sameMenu.getSpecial());






    }
}
