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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
}
