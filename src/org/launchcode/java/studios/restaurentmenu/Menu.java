package org.launchcode.java.studios.restaurentmenu;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Menu {

    //updates if an item is new or not
    public void newnessLevel(MenuItem item) {
        Date currentDate = new Date();
        long diffInMillis = Math.abs(currentDate.getTime() - item.creationDate.getTime());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);

        if (diffInDays <= 30) {
            item.isNew = true;
        } else {
            item.isNew = false;
        }
    }




    public static void main(String[] args) {
        MenuItem waffles = new MenuItem("Waffles", 6.99, "Delicious waffles!", "main");
        MenuItem pancakes = new MenuItem("Pancake Stack", 7.99, "Leaning tower of pancakes!", "main");
        MenuItem standard = new MenuItem("Big Ol' Breakfast", 8.99, "Eggs your way, bacon, hash, and toast", "main");
        MenuItem oatmeal = new MenuItem("Oatmeal", 5.99, "A heart healthy choice!", "main");
        MenuItem omelet = new MenuItem("Omelet", 7.99, "Filled with goat cheese and spinach", "main");
        MenuItem fruitStarter = new MenuItem("Fresh Fruit", 4.99, "Seasonal fruit to share", "appetizer");
        MenuItem miniQuiche = new MenuItem("Mini Quiche", 5.99, "Start your breakfast right!", "appetizer");
        MenuItem chocPancakes = new MenuItem("Chocolate Stack", 7.99, "Pancakes for a sweet tooth", "dessert");
        MenuItem icecream = new MenuItem("Ice Cream Sundae", 4.99, "For when you make adult life choices!", "dessert");


        ArrayList <MenuItem> apps = new ArrayList<>();
        ArrayList <MenuItem> mains = new ArrayList<>();
        ArrayList <MenuItem> desserts = new ArrayList<>();


        apps.add(fruitStarter);
        apps.add(miniQuiche);
        mains.add(waffles);
        mains.add(pancakes);
        mains.add(standard);
        mains.add(oatmeal);
        mains.add(omelet);
        desserts.add(chocPancakes);
        desserts.add(icecream);

        desserts.remove(chocPancakes);
        waffles.isNew = true;
        miniQuiche.isNew = true;


        //Readies menu for printing:
        System.out.println("BREAKFAST TIME MENU\n");
        ArrayList <ArrayList> menu = new ArrayList<>();
        menu.add(apps);
        menu.add(mains);
        menu.add(desserts);
        for (int i=0; i < menu.size(); i++) {
            ArrayList<MenuItem> foods = menu.get(i);
            for (MenuItem item : foods) {
                if (item.isNew == true) {System.out.print("*NEW!* ");}
                System.out.println(item);
            }
            System.out.println("\n-----\n");
        }
        Date today = new Date();
        System.out.println("Menu last updated: " + today + ".");


    }

}
