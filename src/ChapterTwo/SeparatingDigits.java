package ChapterTwo;

import java.util.Scanner;

public class SeparatingDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3, number4, number5;

        System.out.println("Enter first number: ");
        number1 = input.nextInt();

        System.out.println("Enter second number: ");
        number2 = input.nextInt();

        System.out.println("Enter third number: ");
        number3 = input.nextInt();

        System.out.println("Enter fourth number: ");
        number4 = input.nextInt();

        System.out.println("Enter fifth number: ");
        number5 = input.nextInt();

        System.out.printf("%d\t%d\t%d\t%d\t%d", number1, number2, number3, number4, number5);
    }
}
