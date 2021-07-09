package ChapterTwo;

import java.util.Scanner;

public class OddOrEvenNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, odd, even;

        System.out.println("Please enter a value: ");
        number = input.nextInt();

        if (number % 2 == 0)
            System.out.printf("%s %d %s %n", "The number", number, "is Even" );

        else
            System.out.printf("%s %d %s %n", "The number", number, "is Odd" );
    }
}
