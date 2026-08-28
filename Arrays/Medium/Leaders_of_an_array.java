package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Leaders_of_an_array {
    public static List<Integer> leaders(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] point = new boolean[nums.length];

        point[nums.length - 1] = true;
        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                point[i] = true;
                max = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (point[i]) {
                res.add(nums[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(leaders(arr));
    }
}
