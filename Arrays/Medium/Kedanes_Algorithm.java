package Arrays.Medium;

import java.util.Scanner;

public class Kedanes_Algorithm {
    public static int maxSubArray(int[] nums) {
       int sum=nums[0];
       int max=nums[0];
       for(int i=1;i<nums.length;i++){
           sum=Math.max(nums[i],sum+nums[i]);
           max=Math.max(sum,max);
       }
       return max;
    }
    // Printing the Subarray of the kedane Algorithm
    public static void maxSubArrayprint(int[] nums) {
        int sum=nums[0];
        int max=nums[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {

            // Start a new subarray
            if (nums[i] > sum + nums[i]) {
                sum = nums[i];
                tempStart = i;
            }
            else {
                sum = sum + nums[i];
            }

            // Update maximum
            if (sum > max) {
                max = sum;
                start = tempStart;
                end = i;
            }
        }

        for(int i=start;i<=end;i++){
            System.out.print(nums[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
        maxSubArrayprint(arr);
    }
}
