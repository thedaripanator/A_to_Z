package Arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int impl = target - nums[i];
            if (map.containsKey(impl)) {
                return new int[]{map.get(impl), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int[] res = twoSum(arr, target);
        System.out.println("[" + res[0] + "," + res[1] + "]");
    }
}
