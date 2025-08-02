import java.util.Scanner;

public class CircumferenceOfCircle {
    public static final double PI = 3.14;

    public static double CalculateCoC(int r) {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of circle: ");
        int r = sc.nextInt();
        //function call
        double circumference = CalculateCoC(r);
        System.out.println("circumference of circle is:" + circumference);
    }
}
