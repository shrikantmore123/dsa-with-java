import java.util.*;

public class multipleOfTen1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter Num: ");
            int num = sc.nextInt();

            if(num % 10 == 0) {
                System.out.println("Found Multiple of 10");
                continue;
            }

        } while(true);
    }
}