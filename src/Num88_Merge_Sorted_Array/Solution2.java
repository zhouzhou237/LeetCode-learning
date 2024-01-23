package Num88_Merge_Sorted_Array;

import java.util.Arrays;

public class Solution2 {
    public static int[]merge(int[] nums1, int m, int[] nums2, int n) {
        int number = m + n;
        int[] result = new int[number];
        for(int i = 0, index1 = 0, index2 = 0; i < number; i++){
            if(index1 >= m){
                /*If all the data in nums1 has been taken, then all the values in nums2 will be taken.*/
                result[i] = nums2[index2++];
            }else if(index2 >= n){
                /*If all the data in nums2 has been taken, then all the values in nums1 will be taken.*/
                result[i] = nums1[index1++];
            }else if(nums1[index1] < nums2[index2]) {
                /*If the value in nums1 is less than the value in nums2 then take the value in nums1*/
                result[i] = nums1[index1++];
            }else{
                /*If the value in nums2 is less than the value in nums1 then take the value in nums2*/
                result[i] = nums2[index2++];
            }
        }

        /*Let the value in the result in nums1*/
        for(int i =0; i < number; i++){
            nums1[i] = result[i];
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
