package Day1.Evening;
import java.util.Scanner;

public class patterns {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // p1(n);
        p2(n);
        sc.close();
    }

    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4 
    public static void p1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    public static void p2(int n) {
        int count = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
