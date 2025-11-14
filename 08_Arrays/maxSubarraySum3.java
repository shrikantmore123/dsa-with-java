import java.util.*;

public class maxSubarraySum3 {

    // Kadane's Algorithm

    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            
            if(currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Maximum Sum of Subarray: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        maxSubarraySum(numbers);
    }
}

// Complexity : O(n)