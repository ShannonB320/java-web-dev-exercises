package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        do {
            System.out.println("Enter a positive integer for the radius: ");
            while (!input.hasNextDouble()) {
                String invalid = input.next();
                System.out.println("Please enter a valid number: ");
            }

            radius = input.nextDouble();
        } while (radius < 0);

        while (radius < 0) {
            String invalid = input.next();
            System.out.println("Please enter a positive number: ");
        }

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is : " + area);

    }
}
