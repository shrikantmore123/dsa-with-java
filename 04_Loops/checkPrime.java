import java.util.*;

public class checkPrime {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to check Prime or not: ");
        int num = sc.nextInt();

        // int counter = 0;

        // for(int i = 1; i <= num; i++) {
        //     if(num % i == 0) {
        //         counter++;
        //     }
        // }

        // if(counter == 2) {
        //     System.out.println("Number " + num + " is a Prime");
        // }
        // else {
        //     System.out.println("Number " + num + " is a Not Prime");
        // }


        boolean isPrime = true;

        if(num == 2) {
            System.out.println("Number 2 is a Prime");
        }
        else {
            // for(int i = 2; i <= num - 1; i++) {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println("Number " + num + " is a Prime");
            }
            else {
                System.out.println("Number " + num + " is a Not Prime");
            }
        }
    }
}