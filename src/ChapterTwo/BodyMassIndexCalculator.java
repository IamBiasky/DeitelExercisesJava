package ChapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double height;
        double bodyMassIndex;

        System.out.println("Please enter your weight(in kilograms): ");
        weight = input.nextDouble();

        System.out.println("Please enter your height(in meters): ");
        height = input.nextDouble();

        bodyMassIndex = weight/height * height;


        if (bodyMassIndex < 18.5)
            System.out.println(bodyMassIndex + " Underweight");

        if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9)
            System.out.println(bodyMassIndex + " Normal" );

        if (bodyMassIndex >= 25 && bodyMassIndex <= 29.9)
            System.out.println(bodyMassIndex + " Overweight");

        if (bodyMassIndex >= 30 )
            System.out.println(bodyMassIndex + " Obese");

        else
            System.out.println("Inaccurate Weight and Height values!");

        System.out.println();
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 18.5");
        System.out.println("Obese: 30 or greater");

    }
}