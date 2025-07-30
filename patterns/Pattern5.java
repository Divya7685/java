public class Pattern5 {
    public static void main(String[] args) {
        int n=4;
        // for(int i=1;i<=n;i++){
        //     //inner loop --> space print
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //inner loop --> star print //scope of j is within braces only
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //OR
        //rows
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
