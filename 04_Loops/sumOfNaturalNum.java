import java.util.*;

public class sumOfNaturalNum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int range = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i <= range) {
            sum += i;
            i++;
        }
        
        System.out.println(sum);
    }
}