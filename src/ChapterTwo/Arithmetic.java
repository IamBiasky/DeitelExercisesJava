package ChapterTwo;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;
        int product;
        int difference;
        int quotient;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        product = number1 * number2;
        difference = number2 - number1;
        quotient = number2 / number1;

        System.out.println("The Sum is " + sum);
        System.out.println("The Product is " + product);
        System.out.println("The Difference is " + difference);
        System.out.println("The Quotient is " + quotient);
    }
}
