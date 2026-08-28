package Arrays.Medium;

import java.util.*;

public class LongestConsecutiveSequence {
    // Brute Force Solution
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int l = 0;
        int longest = 1;
        for (int r = 1; r < list.size(); r++) {
            if (list.get(r) != list.get(r - 1) + 1) {
                l = r;
            }
            longest = Math.max(longest, r - l + 1);
        }
        return longest;
    }

    // Optimal Code
    public static int longestConsecutive1(int[] nums){
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;
        HashSet<Integer> set=new HashSet<>();
        for(int it:nums){
            set.add(it);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int current=it;
                int currentLength=1;
                while(set.contains(current+1)){
                    currentLength++;
                    current++;
                }
                longest=Math.max(longest,currentLength);
            }
        }
        return longest;
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(longestConsecutive1(arr));

    }
}
