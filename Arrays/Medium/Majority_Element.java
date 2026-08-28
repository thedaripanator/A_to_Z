package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int it : nums) {
            map.put(it, map.getOrDefault(it, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> c : map.entrySet()) {
            if (c.getValue() > (nums.length / 2)) {
                return c.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
}
