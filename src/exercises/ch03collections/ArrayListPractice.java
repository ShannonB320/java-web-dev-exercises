package exercises.ch03collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> array) {
        int total = 0;
        for (int integer : array) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> printChars(ArrayList<String> array) {
        ArrayList<String> exactLetters = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (String string : array) {
            if (string.length() == numChars) {
                exactLetters.add(string);
            }
        }
        return exactLetters;
    }

    public static void main(String[] args) {
        ArrayList<Integer> someInts = new ArrayList<>();
        someInts.add(1);
        someInts.add(2);
        someInts.add(3);
        someInts.add(4);
        someInts.add(5);
        someInts.add(6);
        someInts.add(7);
        someInts.add(8);
        someInts.add(9);
        someInts.add(10);

        int someIntsTotal = sumEven(someInts);
        System.out.println(someIntsTotal);

        ArrayList<String> someWords = new ArrayList<>();
        someWords.add("hello");
        someWords.add("goodbye");
        someWords.add("school");
        someWords.add("codes");
        someWords.add("Java");
        someWords.add("LaunchCode");
        someWords.add("Rocks");

        System.out.println(printChars(someWords));

        String sentence = "I would not could not in a box I would not could not with a fox " +
                "I will not eat them in a house I will not eat them with a mouse";
        String[] wordArray = sentence.split(" ");
        ArrayList<String> sentenceWords = new ArrayList<>();

        for (String string : wordArray) {
            sentenceWords.add(string);
        }
        System.out.println(printChars(sentenceWords));

    }


}
