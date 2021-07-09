package ChapterTwo;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.println("Enter first number: ");
        number1 = input.nextInt();

        System.out.println("Enter second number: ");
        number2 = input.nextInt();

        if (number1 >= number2 && number1 % number2 == 0)
            System.out.printf("%d %s %d %n", number1,"is a multiple of", number2);

        else
            System.out.printf("%d %s %d %n", number1,"is not a multiple of", number2);
    }
}
