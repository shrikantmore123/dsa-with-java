import java.util.*;

public class switchCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Num: ");
        int num1 = sc.nextInt(); 

        System.out.print("Enter 2nd Num: ");
        int num2 = sc.nextInt(); 

        System.out.print("Enter Operator (+, -, *, /, %) : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : 
                System.out.println("Result : " + (num1 + num2));
                break;

            case '-' : 
                System.out.println("Result : " + (num1 - num2));
                break;

            case '*' : 
                System.out.println("Result : " + (num1 * num2));
                break;

            case '/' : 
                System.out.println("Result : " + (num1 / num2));
                break;

            case '%' : 
                System.out.println("Result : " + (num1 % num2));
                break;
            
            default :
                System.out.println("Wrong Operator");
        }
    }
}