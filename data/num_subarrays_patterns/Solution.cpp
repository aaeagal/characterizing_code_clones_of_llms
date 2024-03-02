#include <vector>
#include <string>
#include <algorithm>
#include <iostream>

using namespace std;

class Solution {
public:
        int countMatchingSubarrays(vector<int>& nums, vector<int>& pattern) {
        string s, p;
        for (int i = 1; i < nums.size(); i++)
            s += sign(nums[i] - nums[i - 1]);
        for (int i : pattern)
            p += sign(i);
        return kmp_search(s, p, kmp_table(p)).size();
    }
private:
        vector<int> kmp_table(const string &w) {
        vector<int> t(w.size() + 1);
        t[0] = -1;
        int p = 1, i = 0;
        for (; p < w.size(); ++p, ++i) {
            if (w[p] == w[i])
                t[p] = t[i];
            else {
                t[p] = i;
                while (i >= 0 && w[p] != w[i])
                    i = t[i];
            }
        }
        t[p] = i;
        return t;
    }

    vector<int> kmp_search(string &s, string &w, const vector<int> &t) {
        vector<int> p;
        for (int j = 0, k = 0; j < s.size(); ) {
            if (w[k] == s[j]) {
                ++j, ++k;
                if (k == w.size()) {
                    p.push_back(j - k);
                    k = t[k];
                }
            }
            else {
                k = t[k];
                if (k < 0)
                    ++j, ++k;
            }
        }
        return p;
    }
    char sign(int i) {
        return i > 0 ? '+' : i < 0 ? '-' : '0';
    }

};