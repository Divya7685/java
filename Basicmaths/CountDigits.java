// package Basicmaths;

import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int n){
        int cnt=0;
        while(n>0){
            // int lastdigit=n%10;
            cnt++;
            n=n/10;
        
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        System.out.println(countDigits(n));
        sc.close();
    }
}
