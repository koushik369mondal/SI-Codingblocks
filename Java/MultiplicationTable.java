import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number N: ");
        int n = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + n + ":");
        // Loop from 1 to 10 to print the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }
}