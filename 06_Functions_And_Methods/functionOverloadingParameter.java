public class functionOverloadingParameter {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    };

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    };

    public static void main(String args[]) {
        System.out.println("Sum of 3 and 5 is " + sum(3, 5));
        System.out.println("Sum of 3, 6 and 5 is " + sum(3, 6, 5));
    }
}