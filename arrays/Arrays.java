import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int array[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // //printing numbers of array
        // for(int i=0;i<array.length;i++){
        // System.out.print(array[i]+" ");
        // }

        // to find a number and print postion
        int x = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("x found at index: " + i);
            }

        }
    }
}
