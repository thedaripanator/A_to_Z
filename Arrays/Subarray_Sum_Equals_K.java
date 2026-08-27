package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // cumulative sum 0 occurs once initially
        int total = 0;
        int cumSum = 0;

        for (int num : nums) {
            cumSum += num;                 // running sum
            int residue = cumSum - k;      // needed previous sum
            if (map.containsKey(residue)) {
                total += map.get(residue); // add how many times this sum occurred
            }
            map.put(cumSum, map.getOrDefault(cumSum, 0) + 1);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(subarraySum(arr, k));
    }
}
