class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
}