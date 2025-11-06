/*
Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not) 
A number is called a palindrome if the number is equal to the reverse of a number 
e.g., 121 is a palindrome because the reverse of 121 is 121 itself.
On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
*/

import java.util.*;

public class checkPalindrome {

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int revNum = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit; 
            num = num / 10;
        }

        if(originalNum == revNum) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Num to Check Palindrom: ");
        int num = sc.nextInt();

        boolean isPalindrome = isPalindrome(num);
        System.out.println("The Num " + num + " is palindrome : " + isPalindrome);
    }
}