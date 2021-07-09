package ChapterTwo;

import java.util.Scanner;

public class FiveIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, number3, number4, number5, smallest, largest;

        System.out.println("Enter first integer: ");
        number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        number2 = input.nextInt();

        System.out.println("Enter third integer: ");
        number3 = input.nextInt();

        System.out.println("Enter fourth integer: ");
        number4 = input.nextInt();

        System.out.println("Enter fifth integer: ");
        number5 = input.nextInt();

        smallest = number1;

        if (number2 < smallest)
            smallest = number2;

        if (number3 < smallest)
            smallest = number3;

        if (number4 < smallest)
            smallest = number4;

        if (number5 < smallest)
            smallest = number5;

        largest = number1;

        if (number2 > largest)
            largest = number2;

        if (number3 > largest)
            largest = number3;

        if (number4 > largest)
            largest = number4;

        if (number5 > largest)
            largest = number5;

        System.out.printf("%s %d %n", "The smallest number is", smallest);
        System.out.printf("%s %d %n", "The largest number is", largest);

    }
}
