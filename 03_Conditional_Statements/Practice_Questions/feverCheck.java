/*
Write a Java program that prints 
You have a fever if your temperature is above 100 
and otherwise prints You don't have a fever.
*/

import java.util.*;

public class feverCheck {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter body temperature : ");
        double temp = sc.nextDouble();

        if(temp > 100) {
            System.out.print("You have a fever");
        }
        else {
            System.out.print("You don't have a fever");
        }
    }
}