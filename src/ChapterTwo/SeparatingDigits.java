package ChapterTwo;

import java.util.Scanner;

public class SeparatingDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int firstDigit = number/10000;

        int secondNumber = number % 10000;
        int secondDigit = secondNumber / 1000;

        int thirdNumber = number % 1000;
        int thirdDigit = thirdNumber / 100;

        int fourthNumber = thirdNumber % 100;
        int fourthDigit = fourthNumber / 10;

        int fifthDigit = fourthNumber % 10;


        System.out.println(firstDigit + "  " + secondDigit + "  " + thirdDigit + "  " + fourthDigit + "  " + fifthDigit);

//            number5 = number4 % 10;
//
//            number4 = number1 % 10;
//            number1 = number1/10;
//
//            number3 = number1 % 10;
//            number1 = number1/10;
//
//            number2 = number1 % 10;
//            number1 = number1/10;
//
//        System.out.printf("%d\t%d\t%d\t%d\t%d", number1, number2, number3, number4, number5);
    }
}
