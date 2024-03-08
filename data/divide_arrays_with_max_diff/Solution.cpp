#include <vector>
#include <algorithm>
#include <iostream>
#include <string>
#include <sstream>
using namespace std;


class Solution {
public:
    vector<vector<int>> divideArray(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        vector<vector<int>>ans;
        for(int i=0;i<nums.size();i+=3){
            if(nums[i+2]-nums[i]>k) return {};
            vector<int>tmp={nums[i],nums[i+1],nums[i+2]};
            ans.push_back(tmp);
        }
        return ans;
    }
};

int main() {
    string input;
    while (getline(cin, input)) {
        stringstream ss(input);
        string temp;
        vector<int> nums;
        int k;

        // Extracting nums array
        getline(ss, temp, ']');
        stringstream numstream(temp.substr(1)); // Skip the opening '['
        while (getline(numstream, temp, ',')) {
            nums.push_back(stoi(temp));
        }

        // Extracting k value
        ss >> k; // Read the integer value for k

        Solution solution;
        vector<vector<int>> result = solution.divideArray(nums, k);

        // Printing the result
        for (const auto& subarr : result) {
            cout << '[';
            for (int i = 0; i < subarr.size(); ++i) {
                cout << subarr[i];
                if (i < subarr.size() - 1) cout << ", ";
            }
            cout << ']' << endl;
        }
    }

    return 0;
}



