package Num88_Merge_Sorted_Array;

import java.util.Arrays;

public class Solution3 {
    public static int[]merge(int[] nums1, int m, int[] nums2, int n) {
        int number = m + n;
        for (int i = number - 1, index1 = m - 1, index2 = n - 1; i >= 0; i--) {
            if (index1 < 0) {
                nums1[i] = nums2[index2--];
            } else if (index2 < 0) {
                break;
            } else if (nums1[index1] >= nums2[index2]) {
                nums1[i] = nums1[index1];
                index1--;
            } else {
                nums1[i] = nums2[index2];
                index2--;
            }
        }
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
