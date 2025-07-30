import java.util.Scanner;

public class Prime {
    public static void PrimeOrNot(int n) {
        boolean isPrime = true;
        if(n>0){
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
            if (isPrime) {
            if (n == 1) {
                System.out.println("THis is neither prime nor composite");
            } else {
                System.out.println("this is a prime number");

            }
        } else {
            System.out.println("This is not a prime number");
        }
    }else{
        System.out.println("Input must be greater than 0");
    }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrimeOrNot(n);
    }
}
