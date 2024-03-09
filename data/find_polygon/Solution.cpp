#include <vector>
#include <algorithm>
#include <iostream>
#include <sstream>
#include <string>
using namespace std;
class Solution {
public:
    long long largestPerimeter(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        long long sum=0,ans=-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]<sum) ans=sum+nums[i];
            sum+=nums[i];
        }
        return ans;
    }
};

int main() {
    string input;
    getline(cin, input); // Read the entire line of input

    // Remove the brackets '[' and ']' from the input string
    input = input.substr(1, input.size() - 2);

    vector<int> nums;
    stringstream ss(input);
    string item;

    // Split the input string by commas and convert to integers
    while (getline(ss, item, ',')) {
        nums.push_back(stoi(item));
    }

    // Create an instance of Solution and call the largestPerimeter method
    Solution solution;
    long long perimeter = solution.largestPerimeter(nums);

    // Output the result
    cout << perimeter << endl;

    return 0;
}