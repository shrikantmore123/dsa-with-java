import java.util.*;

public class decimalToBinary {

    public static void decToBin(int decNum) {
        int originalDecNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }

        System.out.println("Binary Form of " + originalDecNum + " is " + binNum);
    }

    public static void main(String args[]) {
        decToBin(5);
    }
}