import java.util.Scanner;

public class GreaterNumber {

    public static int findGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // function Call
        int greater = findGreater(num1, num2);
        System.out.println("The greater number is: " + greater);
    }
}
