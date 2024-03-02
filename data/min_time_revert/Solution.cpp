#include <vector>
#include <string>
using namespace std;

class Solution {
public:
int minimumTimeToInitialState(string word, int k) {
    int n = word.size();
    vector<int> z(n);
    z[0] = n;
    for (int i = 1, l = 0, r = 0; i < n; i++) {
        if (i <= r)
            z[i] = min(z[i - l], r - i + 1);
        for (int &j = z[i]; i + j < n && word[j] == word[i + j]; j++);
        if (i % k == 0 && z[i] == n - i)
            return i / k;
        if (z[i] > r - i + 1)
            l = i, r = i + z[i] - 1;
    }
    return (n + k - 1) / k;
}
};