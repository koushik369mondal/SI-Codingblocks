import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit N: ");
        int n = scanner.nextInt();

        System.out.println("\nEven numbers from 1 to " + n + ":");
        // Loop from 2 to N, incrementing by 2 in each step
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}