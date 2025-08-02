import java.util.Scanner;

public class Vote {
    public static void ValidAgeOrNot(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of a person");
        int age = sc.nextInt();
        ValidAgeOrNot(age);
    }
}
