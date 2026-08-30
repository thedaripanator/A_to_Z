package Arrays.Hard;

import java.util.Scanner;

public class Find_Repeating_and_missing_number {

    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;

        boolean[] check = new boolean[n + 1];
        int repeat = 0;

        for (int i = 0; i < n; i++) {
            if (check[nums[i]]) {
                repeat = nums[i];
            } else {
                check[nums[i]] = true;
            }
        }

        int miss = 0;

        for (int i = 1; i <= n; i++) {
            if (!check[i]) {
                miss = i;
            }
        }

        return new int[]{repeat, miss};
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int [] res=findMissingRepeatingNumbers(arr);

        System.out.println(res[0]+" "+res[1]);
    }
}
