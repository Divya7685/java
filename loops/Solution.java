import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
            do {
                int Marks = sc.nextInt();
                if (Marks >= 90) {
                    System.out.println("This is Good");
                    

                } else if (Marks <= 89 && Marks >= 60) {
                    System.out.println("This is also Good");
                   

                } else if (Marks <= 59 && Marks >= 0) {
                    System.out.println("This is Good as well");
                   
                }else{
                    System.out.println("Inavlid");
                }
                System.out.println("Want to Continue? yes(1) or no(0)");
                input=sc.nextInt();
            } while (input == 1);

        }
    }

