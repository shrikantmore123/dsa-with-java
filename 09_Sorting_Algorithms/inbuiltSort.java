import java.util.*;

public class inbuiltSort {

    public static void printArr(int arr[]) {
    // public static void printArr(Integer arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        // Integer arr[] = {5, 4, 1, 3, 2};
        System.out.print("Before Sorting: ");
        printArr(arr);

        Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3); // (arr, start_index, end_index(non-inclusive))
        // Arrays.sort(arr, Collections.reverseOrder()); // doesn't support primitive datatype int -> Integer
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder());

        System.out.print("After Sorting: ");
        printArr(arr);
    }
}