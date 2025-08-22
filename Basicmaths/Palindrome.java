import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalin(int n) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        return rev== temp ;// itself is a boolean exp
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean pal = checkPalin(n);
        if (pal) {
            System.out.println(n + "is a palindrome");
        } else {
            System.out.println(n + "is not palindrome");
        }

    }
}
