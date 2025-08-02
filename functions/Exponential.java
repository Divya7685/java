import java.util.Scanner;

public class Exponential {
    public static double FindExpo(double n, int x) {
        double result = 1;
        for (int i = 1; i <=x ; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number(n): ");
        double n = sc.nextDouble();
        System.out.print("Enter exponent(x): ");
        int x = sc.nextInt();
        double result = FindExpo(n, x);
        System.out.println(x + " raised to the power " + n + " is: " + result);

        sc.close();
    }
}
