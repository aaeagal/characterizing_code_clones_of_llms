class Solution {
public:
    long long flowerGame(int n, int m) {
        long long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long long AEven = n / 2;
        long long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
};