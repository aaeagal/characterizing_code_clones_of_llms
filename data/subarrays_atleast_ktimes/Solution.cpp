#include <vector>
#include <algorithm>
#include <iostream>
#include <sstream>
#include <string>

using namespace std;
class Solution {
public:
    long long f(const vector<int>& arr, int target, int k) {
        long long n=arr.size(),ans=0,cnt=0,left=0;
        for (long long right=0;right<n;right++){
            if (arr[right] == target)cnt++;
            while(cnt>=k){
                ans+=(n-right);
                if(arr[left]==target) cnt--;
                left++;
            }
        }
        return ans;
    }
    long long countSubarrays(vector<int>& nums, int k) {
        int maxi=*max_element(nums.begin(),nums.end());
        return f(nums,maxi,k);
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
    long long result = solution.countSubarrays(nums, k);

    // Output the result
    cout << result << endl;

    return 0;
}