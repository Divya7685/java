import java.util.*;

class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        // if (button == 1)
        //     System.out.println("hello");
        // else if (button == 2) {
        //     System.out.println("namaste");
        //     System.out.println("namaste1");
        // } else if (button == 3)
        //     System.out.println("bonjour");

        // else
        //     System.out.println("invalid");


        switch(button){
            case 1:System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid");
        }

    }
}
