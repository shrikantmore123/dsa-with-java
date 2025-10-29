import java.util.*;

public class TypePromotion {
    public static void main(String args[]) {

        char ch1 = 'a';
        long ch2 = 'b';

        System.out.println((int)(ch2));
        System.out.println((int)(ch1));
        System.out.println(ch2-ch1);

        System.out.println();

        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a + b + c);
        System.out.println(bt);

        System.out.println();

        int num1 = 10;
        float num2 = 20.25f;
        long num3 = 25;
        double num4 = 30;
        double ans = num1 + num2 + num3 + num4;
        System.out.println(ans);

        System.out.println();

        byte numb = 5;
        byte mul = (byte) (numb * 2); 
        System.out.println(mul);
    }
}