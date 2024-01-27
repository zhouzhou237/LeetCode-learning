package Num70_Climbing_Stairs;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    private Map<Integer, Integer> storeMap = new HashMap<>();

    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(storeMap.get(n) != null) {
            return storeMap.get(n);
        }else {
            int result = storeMap.get(n-1) + storeMap.get(n-2);
            storeMap.put(n,result);
            return storeMap.get(result);
        }
    }
}
