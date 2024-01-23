package Num1_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            Integer number2 = map.get(number);
            if(number2 == null) {
                map.put(nums[i], i);
            }else {
                result[0] = number2;
                result[1] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] newnum =  new int[]{1,2,3,4,5,6,7,8};
        int target = 10;
        int[] result = twoSum(newnum,target);
        System.out.print(Arrays.toString(result));
    }
}
