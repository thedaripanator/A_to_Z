package Arrays;

import java.util.Scanner;

public class LongestSubstring {
    public static int longestSubarray(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int max = 0;
        while (j < nums.length) {
            count += nums[j];
            if (count == k) {
                max = Math.max(max, j - i + 1);
                count -= nums[i];
                i++;
            }
            j++;
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
        int k = sc.nextInt();
        System.out.println(longestSubarray(arr, k));
    }
}
