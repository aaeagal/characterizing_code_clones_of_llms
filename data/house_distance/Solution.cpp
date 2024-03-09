#include <vector>
#include <cmath>
#include <iostream>
#include <sstream>

using namespace std;
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

int main() {
    int n, x, y;
    cin >> n >> x >> y; // Reads the three integers

    Solution solution;
    vector<int> result = solution.countOfPairs(n, x, y);

    // Output the result as an array of integers
    cout << "[";
    for (int i = 0; i < result.size(); i++) {
        cout << result[i];
        if (i < result.size() - 1) {
            cout << ", ";
        }
    }
    cout << "]" << endl;
    return 0;
}