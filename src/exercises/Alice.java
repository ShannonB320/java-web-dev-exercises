package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her" +
                "sister was reading, but it had no pictures or conversations in it, 'and what" +
                "is the use of a book,' thought Alice 'without pictures or conversation?'";
        String searchReady = sentence.toLowerCase();

        System.out.println("For which term would you like to search?");
        String searchTerm = input.nextLine();
        String searchMe = searchTerm.toLowerCase();

        boolean answer = searchReady.contains(searchMe);
        System.out.println(answer);

        int index = searchReady.indexOf(searchMe);
        int length = searchMe.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is "
                + length + " characters long.");
        String modifiedSentence = searchReady.replace(searchMe, "");
        System.out.println(modifiedSentence);
    }
}
