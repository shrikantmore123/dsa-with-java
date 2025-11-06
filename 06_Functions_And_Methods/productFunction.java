public class productFunction {

    public static int multiply(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    public static void main(String args[]) {
        int num1 = 5;
        int num2 = 10;

        int product = multiply(num1, num2);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + product);
    }
}