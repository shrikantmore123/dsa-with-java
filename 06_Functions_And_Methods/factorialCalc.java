public class factorialCalc {

    public static int factorial(int num) {
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String args[]) {

        System.out.println("Factorial is " + factorial(5));
    }
}