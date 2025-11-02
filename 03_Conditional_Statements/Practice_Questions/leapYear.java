/*
Write a Java program that takes a year from the user 
and print whether that year is a leap year or not.
Hint: Is year divisible by 4 or 100 or 400
*/

import java.util.*;

public class leapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(year % 4 == 0) {
            System.out.print(year + " is leap year");
        }
        else if(year % 100 == 0) {
            System.out.print(year + " is leap year");
        }
        else if(year % 400 == 0) {
            System.out.print(year + " is leap year");
        }
        else {
            System.out.print(year + " is not leap year");
        }
    }
}