import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        long n = scanner.nextLong(); // Using long to prevent integer overflow for large N

        if (n < 1) {
            System.out.println("Please enter a positive integer starting from 1.");
        } else {
            // Formula: Sum = (N * (N + 1)) / 2
            long sum = (n * (n + 1)) / 2;
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}