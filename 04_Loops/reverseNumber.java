import java.util.*;

public class reverseNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
        while(num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit + " ");
            num = num / 10;
        }        
    }
}