package Num448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.List;
public class Solution2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for(int num : nums) {
            int x = (num -1)%n ;/* Reduce the original value of n by taking the remainder of n */
            nums[x] += n;
        }

        List<Integer> result = new ArrayList<Integer>();
        for(int i =0; i < n; i++){
            if(nums[i] <= n){
                result.add(i+1);
            }
        }
        return result;
    }
}
