public class Fibonacci {
    
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        
        int a = 0;
        int b = 1;
        
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        
        return b;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci(" + n + ") = " + fib(n)); // Output: 8
    }
}