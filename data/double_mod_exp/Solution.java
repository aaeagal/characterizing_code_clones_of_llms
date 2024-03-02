import java.util.*;
class Solution {
    //returns (a ^ b) % mod
    private int power (int a, int b, int mod) {
        if (b == 0)
                return 1;
        if (b % 2 == 0)
            return power((a * a) % mod, b / 2, mod);
        else
            return (a * power((a * a) % mod , b / 2, mod)) % mod;
    }
    
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < variables.length; i++) {
            int a = variables[i][0], b = variables[i][1], c = variables[i][2], m = variables[i][3];
            int calculated = power(power(a, b, 10), c, m);
            if (calculated == target)
                result.add(i);
        }
        return result;
    }
}