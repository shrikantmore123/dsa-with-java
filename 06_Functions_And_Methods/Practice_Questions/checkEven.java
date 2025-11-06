/*
Write a method named isEven that accepts an int argument.
The method should return true if the argument iseven,or false otherwise. 
Also write a program to test your method.
*/

import java.util.*;

public class checkEven {

    public static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        }

        return false;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num to check Even: ");
        int num = sc.nextInt();

        boolean isEven = isEven(num);
        System.out.print("The Num " + num + " is Even: " + isEven);
    }
}