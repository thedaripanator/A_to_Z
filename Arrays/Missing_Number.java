package Arrays;

import java.util.Scanner;

public class Missing_Number {
    public static int missingNumber(int[] nums) {
         int total=0;
         // Calculating the Total sum of the range
         for(int i=0;i<=nums.length;i++){
              total+=i;
         }

         // Calculating the sum of the elements of the Array
        for(int i=0;i<nums.length;i++){
            total-=nums[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(missingNumber(arr));
    }

}
