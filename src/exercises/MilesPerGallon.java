package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles driven:");
        int miles = input.nextInt();

        System.out.println("Enter the gallons of gas consumed:");
        int gallons = input.nextInt();

        int mpg = miles / gallons;
        System.out.println(mpg + " miles per gallon");
    }
}
