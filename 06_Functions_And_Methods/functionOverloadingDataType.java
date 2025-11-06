public class functionOverloadingDataType {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    };

    public static float sum(float num1, float num2) {
        return num1 + num2;
    };

    public static void main(String args[]) {
        System.out.println("Sum of 3 and 5 is " + sum(3, 5));
        System.out.println("Sum of 3, 6 and 5 is " + sum(3.2f, 4.8f));
    }
}