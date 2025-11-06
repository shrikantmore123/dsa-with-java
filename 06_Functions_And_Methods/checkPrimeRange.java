import java.util.*;

public class checkPrimeRange {

    public static boolean isPrime(int num) {

        if(num == 2) {
            return true;
        }

        // for(int i = 2; i <= num - 1; i++) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static void primeInRange(int num) {

        for(int i = 2; i <= num; i++) {
            if(isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        primeInRange(20);
    }
}