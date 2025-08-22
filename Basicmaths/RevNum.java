import java.util.Scanner;

public class RevNum {
    public static int revOfNum(int n) {
        int rev = 0;
        while (n > 0) {

            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = revOfNum(n);
        System.out.println(rev);

    }
}
