import java.util.*;

public class UserInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(input);

        sc.nextLine();

        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);
    }
}