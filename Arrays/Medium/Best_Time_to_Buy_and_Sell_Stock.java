package Arrays.Medium;

import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] arr) {
         int buy=arr[0];
         int max=0;
         for(int i=1;i<arr.length;i++){
             if(arr[i] < buy){
                 buy=arr[i];
             }
             else{
                 max=Math.max(max,arr[i]-max);
             }
         }
         return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProfit(arr));
    }
}
