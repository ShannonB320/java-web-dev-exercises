package org.launchcode.java.studios.countoccurrences;
import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {
    public static HashMap<String, Integer> countOccurrences(String[] array) {
        HashMap<String, Integer> characterCount = new HashMap<>();

        for (String i : array) {
            Integer j = characterCount.get(i);
            characterCount.put(i, (j == null) ? 1 : (j+1));
        }

        for (Map.Entry<String, Integer> character : characterCount.entrySet()) {
             System.out.println(character.getKey() + " : " + character.getValue());
        }
        return characterCount;
    }

    public static void main (String[] args) {
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        String[] sentenceArray = sentence.split("");

        System.out.println(countOccurrences(sentenceArray));


    }


}
