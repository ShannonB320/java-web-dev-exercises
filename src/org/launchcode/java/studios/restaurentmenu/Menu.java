package org.launchcode.java.studios.restaurentmenu;
import java.util.ArrayList;

public class Menu {


    public static void main(String[] args) {
        MenuItem waffles = new MenuItem("Waffles", 6.99, "Delicious waffles!");
        MenuItem pancakes = new MenuItem("Pancake Stack", 7.99, "Leaning tower of pancakes!");


        ArrayList <MenuItem> menu = new ArrayList<>();
        menu.add(waffles);
        menu.add(pancakes);


        for (MenuItem item : menu) {
            System.out.println(item);
        }

    }


}
