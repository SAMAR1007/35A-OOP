import java.util.Scanner;

public class week3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Program to find the maximum between three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("The maximum number is: " + max);

        // 2. Program to check whether a number is negative, positive, or zero
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // 3. Program to check whether a number is divisible by 5 and 11 or not
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("The number is divisible by 5 and 11.");
        } else {
            System.out.println("The number is not divisible by 5 and 11.");
        }

        // 4. Program to check whether a number is even or odd
        System.out.print("Enter a number: ");
        int numEvenOdd = scanner.nextInt();

        if (numEvenOdd % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // 5. Program to check whether a year is a leap year or not
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

        // 6. Program to input any alphabet and check whether it is vowel or consonant
        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().charAt(0);

        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The alphabet is a vowel.");
                break;
            default:
                System.out.println("The alphabet is a consonant.");
                break;
        }

        scanner.close();
    }
}