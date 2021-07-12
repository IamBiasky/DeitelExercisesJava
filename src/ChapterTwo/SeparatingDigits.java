package ChapterTwo;

import java.util.Scanner;

public class SeparatingDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3, number4, number5;

        System.out.println("Enter a number: ");
        number1 = input.nextInt();

        if (9999 < number1 && number1 < 100000)

            number5 = number1 % 10;
            number1 = number1/10;

            number4 = number1 % 10;
            number1 = number1/10;

            number3 = number1 % 10;
            number1 = number1/10;

            number2 = number1 % 10;
            number1 = number1/10;

//        System.out.printf("%d\t%d\t%d\t%d\t%d", number1, number2, number3, number4, number5);
    }
}
