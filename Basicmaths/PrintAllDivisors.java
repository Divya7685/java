import java.util.Scanner;

public class PrintAllDivisors {
    public static void printAllDiv(int n) {
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllDiv(n);

    }
}
