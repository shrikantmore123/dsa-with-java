public class reverseArray {

    public static void reverse(int numbers[]) {

        int first = 0, last = numbers.length - 1;

        while(first < last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println("After Reversing : ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        reverse(numbers);
        
        System.out.println("\n\nAfter Reversing : ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}