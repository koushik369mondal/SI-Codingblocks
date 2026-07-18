// leetcode - 7

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int reversedNum = 0;

        // Loop to reverse the digits
        while (num != 0) {
            int lastDigit = num % 10; // Extract the last digit
            reversedNum = reversedNum * 10 + lastDigit; // Append it to the reversed number
            num = num / 10; // Remove the last digit from the original number
        }

        System.out.println("Original Number: " + originalNum);
        System.out.println("Reversed Number: " + reversedNum);

        scanner.close();
    }
}