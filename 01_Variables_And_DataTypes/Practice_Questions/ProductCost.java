/* 
Enter cost of 3 items from the user (using float datatype) - a pencil, apenandan eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/

import java.util.*;

public class ProductCost {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of Pencil: ");
        float pencilPrice = sc.nextFloat();

        System.out.print("Enter price of Pen: ");
        float penPrice = sc.nextFloat();

        System.out.print("Enter price of Eraser: ");
        float eraserPrice = sc.nextFloat();

        float cost = pencilPrice + penPrice + eraserPrice;
        System.out.println("Cost of all products: " + cost);
        
        System.out.println("Total GST on Products: 18 %");

        float totalCost = cost + ((cost / 100) * 18);
        // float totalCost = cost + (0.18f * cost);    // From Solution
        System.out.println("Final Cost of all products (including 18 % GST): " + totalCost);
    }
}