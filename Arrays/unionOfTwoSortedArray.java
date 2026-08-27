package Arrays;

import java.util.Scanner;

public class unionOfTwoSortedArray {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n + m];
        int i = 0; // Point to the Oth Index of nums1
        int j = 0; // Point to the 0th Index of nums2
        int k = 0;
        while (i < n && j < m) {
            if (nums1[i] > nums2[j]) {
                res[k++] = nums2[j++];
            } else {
                res[k++] = nums1[i++];
            }
        }
        while (i < n) {
            res[k++] = nums1[i++];
        }

        while (j < m) {
            res[k++] = nums2[j++];
        }

        return res;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] res = unionArray(arr1, arr2);

        for (int it : res) {
            System.out.print(it + " ");
        }
    }

}



