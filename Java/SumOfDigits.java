import java.util.Scanner;

public class SumOfDigits {

    public static int getSumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Sum of digits: " + getSumOfDigits(num));

        scanner.close();
    }
}