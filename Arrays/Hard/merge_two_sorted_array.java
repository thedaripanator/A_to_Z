package Arrays.Hard;

import java.util.Scanner;

public class merge_two_sorted_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                result[k++] = nums2[j++];
            } else if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];

            } else {
                result[k++] = nums1[i++];
                result[k++] = nums2[j++];
            }
        }
        while (i < m) {
            result[k++] = nums1[i++];
        }
        while (j < n) {
            result[k++] = nums2[j++];
        }

        for (int p = 0; p < m + n; p++) {
            nums1[p] = result[p];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int[] arr1 = new int[m1];
        for (int i = 0; i < m1; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int n1 = sc.nextInt();
        int[] arr2 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr2[i] = sc.nextInt();
        }
        int n = sc.nextInt();

        merge(arr1, m, arr2, n);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
