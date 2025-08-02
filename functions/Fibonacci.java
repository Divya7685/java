import java.util.Scanner;

public class Fibonacci {
    public static void PrintFibonacci(int n) {
        int a = 0, b = 1;

        System.out.println("Fibonacci series from 1 to " + n + " is: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        PrintFibonacci(n);
        sc.close();
    }
}
