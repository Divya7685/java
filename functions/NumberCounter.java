import java.util.Scanner;

public class NumberCounter {

    // Function to check and update counts
    public static void updateCounts(int num, int[] counts) {
        if (num > 0) {
            counts[0]++; // positive count
        } else if (num < 0) {
            counts[1]++; // negative count
        } else {
            counts[2]++; // zero count
        }
    }

    // Function to display the result
    public static void displayCounts(int[] counts) {
        System.out.println("Count of positive numbers: " + counts[0]);
        System.out.println("Count of negative numbers: " + counts[1]);
        System.out.println("Count of zeros: " + counts[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = {0, 0, 0}; // {positive, negative, zero}

        String choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            updateCounts(num, counts);

            System.out.print("if don't want to enter another number? (-1): ");
            choice = sc.next().toLowerCase();
        } while (choice.equals("yes"));

        displayCounts(counts);
        sc.close();
    }
}
