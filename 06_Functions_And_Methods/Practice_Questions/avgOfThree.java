/*
Write a Java method to compute the average of three numbers.
*/

import java.util.*;

public class avgOfThree {

    public static int calAvg(int val1, int val2, int val3) {
        return (val1 + val2 + val3) / 3;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Num : ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd Num : ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd Num : ");
        int num3 = sc.nextInt();

        int res = calAvg(num1, num2, num3);
        System.out.println("Average : " + res);
    }
}