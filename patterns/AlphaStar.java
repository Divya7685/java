public class AlphaStar {

    public static void main(String[] args) {
        int n = 5;
        int num=64;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i + j == 6 ) {
                    System.out.print(num+i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

