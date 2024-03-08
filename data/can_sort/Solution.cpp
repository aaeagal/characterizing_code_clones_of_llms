#include <vector>
#include <algorithm>
#include <iostream>
#include <string>
#include <sstream>
using namespace std;

class Solution {
public:
    bool canSortArray(vector<int>& nums) {
        int n = nums.size();
        
        vector<int> c = nums;
        sort(begin(c),end(c));
        
        int prev=0 , i=0;
        int a = __builtin_popcount(nums[0]);
        while(i < n) {
            int b = __builtin_popcount(nums[i]);
            
            while(i<n && a==__builtin_popcount(nums[i])) {
                i++;
            }
            sort(nums.begin()+prev,nums.begin()+i);
            prev = i;
            if(i < n)   a = __builtin_popcount(nums[i]);
        }
        return c==nums;
    }
};

int main() {
    string input;
    getline(cin, input);
    istringstream ss(input);
    int number;
    vector<int> nums;
    while (ss >> number) {
        nums.push_back(number);
    }
    Solution solution;
    bool result = solution.canSortArray(nums);
    // print the result as true or false
    cout << (result ? "true" : "false") << endl;
    
    return 0;
}
