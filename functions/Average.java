import java.util.Scanner;

public class Average {

    public static int AvgOf3(int a, int b, int c) {

        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter seccond number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        // calculate Average
        int avg = AvgOf3(a, b, c);
        System.out.println("Average of three numbers: " + avg);
    }
}