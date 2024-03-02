public class Solution {
    public long count(long k, int bit, int x) {
        if (k < bit)
            return 0;
        long n = 1, bits = bit, p = 1;
        while (2 * bits + (p % x == 0 ? n : 0) <= k) {
            bits = 2 * bits + (p % x == 0 ? n : 0);
            n *= 2;
            ++p;
        }
        return n + count(k - bits, bit + (p % x == 0 ? 1 : 0), x);
    }

    public long findMaximumNumber(long k, int x) {
        return count(k, 0, x) - 1;
    }

    
}