
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        String names[]=new String[size];

        for(int i=0;i<size;i++){
            names[i]=sc.nextLine();
        }


        for(int i=0;i<names.length;i++){
            System.out.println("Name "+ (i+1) + " is: " + names[i]);
        }
    }
}
