#include <vector>
#include <unordered_map>
#include <climits>
#include <algorithm>
#include <iostream>
#include <string>
#include <sstream>

using namespace std;
class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        int n = nums.size();
        long ans = LONG_MIN, preSum = 0;
        unordered_map<int, int> mp;
        vector<long> pre;
        for(auto it : nums){
            preSum += it;
            pre.push_back(preSum);
        }
        for(int i = 0 ; i < n ; i++){
            int diff1 = nums[i] - k, diff2 = nums[i] + k;
            if(mp.contains(diff1))
                ans = max(ans, pre[i] - pre[mp[diff1]] + diff1);
            if(mp.contains(diff2))
                ans = max(ans, pre[i] - pre[mp[diff2]] + diff2);
            if(mp.contains(nums[i]))
                mp[nums[i]] = pre[i] < pre[mp[nums[i]]] ? i : mp[nums[i]];
            else
                mp[nums[i]] = i;
        }
        return ans != LONG_MIN ? ans : 0;
    }
};

vector<int> parseInputVector(string input) {
    vector<int> result;
    stringstream ss(input.substr(1, input.size() - 2)); // Remove the brackets
    string item;
    while (getline(ss, item, ',')) {
        result.push_back(stoi(item));
    }
    return result;
}

int main() {
    string line;
    getline(cin, line); // Reads the entire input line

    // Splitting the input line into two parts: vector and integer
    size_t spacePos = line.find_last_of(' ');
    string vectorPart = line.substr(0, spacePos);
    int k = stoi(line.substr(spacePos + 1));

    vector<int> nums = parseInputVector(vectorPart);

    Solution solution;
    long long result = solution.maximumSubarraySum(nums, k);

    // Output the result
    cout << result << endl;

    return 0;
}