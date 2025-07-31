public class HollowButterfly {
    public static void main(String[] args) {
        int n=4;
        //upper half
        for(int i=1;i<=n;i++){
            //1st half
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //stars 2nd half
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }



        //lower half
         for(int i=n;i>=1;i--){
            //1st half
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //stars 2nd half
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
