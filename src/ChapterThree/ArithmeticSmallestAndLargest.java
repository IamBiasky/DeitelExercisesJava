package ChapterThree;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ArithmeticSmallestAndLargest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3, sum, product, average, smallest, largest;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        average = sum/3;

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The average is: " + average);

        smallest = number1;
        largest = number1;

        if (number1 > number2 && number1 > number3)
            System.out.printf("%s %d %s", "The number", number1, "is larger");

        if (number2 > number1 && number2 > number3)
            System.out.printf("%s %d %s", "The number", number2, "is larger");

        if (number3 > number2 && number3 > number1)
            System.out.printf("%s %d %s %n", "The number", number3, "is larger");

        if (number1 < number2 && number1 < number3)
            System.out.printf("%s %d %s %n", "The number", number1, "is smaller");

        if (number2 < number1 && number2 < number3)
            System.out.printf("%s %d %s", "The number", number2, "is smaller");

        if (number3 < number2 && number3 < number1)
            System.out.printf("%s %d %s %n", "The number", number3, "is smaller");



    }
}
