public class swappingTwoNum {

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter swapping \n1st Number : " + num1 + "\n2nd Number : " + num2);
    }

    public static void main(String args[]) {

        int num1 = 5;
        int num2 = 10;

        System.out.println("Before swapping \n1st Number : " + num1 + "\n2nd Number : " + num2);

        swap(num1, num2);
    }
}