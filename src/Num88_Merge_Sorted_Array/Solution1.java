package Num88_Merge_Sorted_Array;

import java.util.Arrays;

public class Solution1 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
        int[] result = merge(nums1,m,nums2,n);
        System.out.print(Arrays.toString(result));

    }
}
