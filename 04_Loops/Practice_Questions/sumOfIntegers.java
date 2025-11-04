/*
Write a program that reads a set of integers, 
and then prints the sum of the even and odd integers.
*/

import java.util.*;

public class sumOfIntegers {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int oddSum = 0;
        int evenSum = 0;
        int choice = 0;

        do {
            System.out.print("Enter Integer: ");
            num = sc.nextInt();

            if(num % 2 == 0) {
                evenSum += num;
            }
            else {
                oddSum += num;
            }

            System.out.print("Enter 1 for Continue or 0 for exit: ");
            choice = sc.nextInt();

        } while(choice == 1);

        System.out.println("Sum of Even Integer: " + evenSum);
        System.out.println("Sum of Odd Integer: " + oddSum);
    }
}