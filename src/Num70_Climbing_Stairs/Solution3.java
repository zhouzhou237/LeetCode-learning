package Num70_Climbing_Stairs;

public class Solution3 {
    public int climbStairs (int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int result = 0;
        int number1 = 2;
        int number2 = 1;
        for(int i = 3; i <= n; i++){
            result = number1 + number2;
            number2 = number1;
            number1 = result;
        }
        return result;
    }
}
