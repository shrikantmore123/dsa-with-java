/*
Write a Java program to get a number from the user 
and print whether it is positive or negative
*/

import java.util.*;

public class positiveNegative {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.print("Number " + num + " is postive");
        }
        else if(num < 0) {
            System.out.print("Number " + num + " is negative");
        }
        else {
            System.out.print("Number is zero");
        }
    }
}