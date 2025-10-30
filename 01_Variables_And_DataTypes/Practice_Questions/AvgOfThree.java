/* 
In a program,input 3 numbers : A, B and C.
You have to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)
*/

import java.util.*;

public class AvgOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int A = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int B = sc.nextInt();

        System.out.print("Enter 3rd Number: ");
        int C = sc.nextInt();

        int avg = (A + B + C) / 3;
        System.out.println("Average: " + avg);
    }
}