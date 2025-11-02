public class largestOfThree {
    public static void main(String arg[]) {

        int num1 = 1, num2 = 3, num3 = 6;

        if((num1 >= num2) && ( num1 >= num3)) {
            System.out.println(num1);
        }
        else if(num2 >= num3) {
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }



        // int num1 = 1, num2 = 3, num3 = 6;

        // if(num1 > num2) {
        //     if(num1 > num3) {
        //         System.out.println(num1);
        //     }
        //     else {
        //         System.out.println(num3);
        //     }
        // }
        // else if(num2 > num1) {
        //     if(num2 > num3) {
        //         System.out.println(num2);
        //     }
        //     else {
        //         System.out.println(num3);
        //     }
        // }
        // else {
        //         System.out.println(num3);
        // }
    }
}