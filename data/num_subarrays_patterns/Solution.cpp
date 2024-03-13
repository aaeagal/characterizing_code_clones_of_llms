#include <vector>
#include <string>
#include <algorithm>
#include <iostream>
#include <sstream>
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

vector<int> parseInputVector(const string& input) {
    vector<int> result;
    stringstream ss(input.substr(1, input.find(']') - 1)); // Extract numbers without brackets
    string item;
    while (getline(ss, item, ',')) {
        result.push_back(stoi(item));
    }
    return result;
}

int main() {
    string line;
    getline(cin, line); // Reads the entire line containing both vectors

    // Splitting the input line into two parts based on the space between arrays
    size_t spacePos = line.find("] ") + 1;
    string input1 = line.substr(0, spacePos);
    string input2 = line.substr(spacePos + 1);

    vector<int> arr1 = parseInputVector(input1);
    vector<int> arr2 = parseInputVector(input2);

    Solution solution;
    int result = solution.countMatchingSubarrays(arr1, arr2);

    // Output the result
    cout << result << endl;

    return 0;
}
