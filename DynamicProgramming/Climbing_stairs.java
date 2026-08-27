package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Climbing_stairs {
    static int [] dp;
    public static int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int one = 0, two = 0;
        if (n >= 2) {
            two = climbStairs(n - 2);
        }
        one = climbStairs(n - 1);

        return dp[n]=one + two;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(climbStairs(n));
    }
}
