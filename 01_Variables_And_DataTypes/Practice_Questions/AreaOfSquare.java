/* 
In a program,input the side of a square.
You have to output the area of the square.
(Hint : area of a square is (side x side))
*/

import java.util.*;

public class AreaOfSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side of Square: ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
}