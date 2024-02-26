class Solution {
public:
    
    vector<int> countOfPairs(int n, int x, int y) {
        vector<int> ans(n, 0);
        for (int i = 1; i <= n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                int d = min(abs(i - j), min(abs(i - x) + 1 + abs(y - j), abs(i - y) + 1 + abs(x - j)));
                ans[d - 1] += 2;
            }
        }
        return ans;
    }

};