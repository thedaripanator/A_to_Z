package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Frog_Jump {
    static  int [] dp;
    public static int frogJump(int[] arr) {
      return solve(arr,0);
    }
    public static  int solve(int [] arr,int i){
        if(i==arr.length-1){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }
        int one=Math.abs(arr[i]-arr[i+1]) + solve(arr,i+1);

        int two=Integer.MAX_VALUE;

        if(i+2 < arr.length){
            two=Math.abs(arr[i]-arr[i+2])+solve(arr,i+2);
        }

        return dp[i]=Math.min(one,two);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(frogJump(arr));
    }
}
