/*
Search about (Google) & use the following methods of the Math class in Java:
a.Math.min( ) 
b.Math.max( )
c.Math.sqrt( )
d.Math.pow( )
e.Math.avg( )
f.Math.abs( )
*/

import java.util.*;

public class mathFunctions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Minimum value from 10 and 20 : " + Math.min(10, 20));
        System.out.println("Maximum value from 10 and 20 : " + Math.max(10, 20));
        System.out.println("Square Root of 25 : " + Math.sqrt(25));
        System.out.println("8th Power of 2 : " + Math.pow(2, 8));
        // System.out.println("Average of 10 and 20 : " + Math.avg(10, 20));
        System.out.println("Absolute value of -1 : " + Math.abs(-1));
    }
}