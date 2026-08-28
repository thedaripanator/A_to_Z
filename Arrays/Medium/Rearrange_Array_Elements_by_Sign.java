package Arrays.Medium;

import java.util.Scanner;

public class Rearrange_Array_Elements_by_Sign {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0; // For Indicating the Positive Number
        int j = 0; // For Indicating the Negative Number
        int z = 0;
        for (int k = 0; k < n; k++) {
            if (nums[k] > 0) {
                i = k;
                break;
            }
        }
        for (int k = 0; k < n; k++) {
            if (nums[k] < 0) {
                j = k;
                break;
            }
        }
        while (i < n && j < n) {
            res[z++] = nums[i];
            res[z++] = nums[j];
            i++;
            j++;
            while (i < n) {
                if (nums[i] > 0) {
                    break;
                }
                i++;
            }

            while (j < n) {
                if (nums[j] < 0) {
                    break;
                }
                j++;
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

        int[] ans = rearrangeArray(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
