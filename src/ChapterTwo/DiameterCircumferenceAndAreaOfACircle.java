package ChapterTwo;

import java.util.Scanner;

import static java.lang.Math.PI;

public class DiameterCircumferenceAndAreaOfACircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int diameter, radius;
        double PI, area, circumference;

        System.out.println("Enter the value of radius: ");
        radius = input.nextInt();

        System.out.printf("%s%d%n", "The Diameter is ", 2 * radius);
        System.out.printf("%s%f%n", "The Circumference is 2 ", 2 * Math.PI * radius);
        System.out.printf("%s%f%n", "The Area of Circle is ", Math.PI * 2 * radius);


    }
}
