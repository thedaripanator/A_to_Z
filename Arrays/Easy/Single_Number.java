package Arrays.Easy;

import java.util.Scanner;

public class Single_Number {
    public static int singleNumber(int[] nums) {
//        a ^ a = 0
//        a ^ 0 = a
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumber(arr));
    }
}

// Input :  2 2 1
// Output:   1
