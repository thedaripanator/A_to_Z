package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Frog_Jump_With_K_Steps {
    static int[] dp;

    public static int frogJump(int[] arr, int k) {
        return solve(arr, k, 0);
    }

    public static int solve(int[] arr, int k, int i) {
        if (i == arr.length - 1) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int one = Math.abs(arr[i] - arr[i + 1]) + solve(arr, k, i + 1);
        int two = Integer.MAX_VALUE;

        if (i + k < arr.length) {
            two = Math.abs(arr[i] - arr[i + k]) + solve(arr, k, i + k);
        }

        return dp[i] = Math.min(one, two);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(frogJump(arr, k));
    }
}
