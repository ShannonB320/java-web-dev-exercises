package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        ArrayList<String> o1Allergens = o1.getAllergens();
        ArrayList<String> o2Allergens = o2.getAllergens();
        if (o1Allergens.size() < o2Allergens.size()) {
            return 1;
        } else if (o1Allergens.size() > o2Allergens.size()) {
            return -1;
        } else {
            return 0;
        }
    }

}
