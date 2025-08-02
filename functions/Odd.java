import java.util.Scanner;

public class Odd {
    public static void SumOfOdd(int n) {
        int odd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                odd = odd + i;
            }
        }
        System.out.println("Sum of All Odd numbers from 1 to " + n + " is: " + odd);
        return;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        SumOfOdd(n);

    }
}
