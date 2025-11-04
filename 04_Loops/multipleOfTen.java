import java.util.*;

public class multipleOfTen {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
    //     System.out.print("Enter Num: ");
    //     int num = sc.nextInt();

    //     while(num > 0) {
    //         if(num % 10 == 0) {
    //             break;
    //         }

    //         System.out.print("Enter Num: ");
    //         num = sc.nextInt();
    //    }

    //     System.out.println("Found Multiple of 10");


        do {
            System.out.print("Enter Num: ");
            int num = sc.nextInt();

            if(num % 10 == 0) {
                break;
            }

        } while(true);

       System.out.println("Found Multiple of 10");
    }
}