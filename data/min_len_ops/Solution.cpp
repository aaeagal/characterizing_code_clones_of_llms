#include <vector>
#include <climits>
#include <iostream>
#include <sstream>
#include <string>

using namespace std;
class Solution {
public:
    int minimumArrayLength(vector<int>& nums) {
        int mx = INT_MIN, mn = INT_MAX, res = 0;
        for(auto& a: nums) 
            mx = max(mx, a), mn = min(mn, a);
        for(auto& a: nums)
            if(a == mn) res++;
            else if(a % mn != 0) return 1;
        return (res+1)/2;
    }
};

std::vector<int> parseInputVector(const std::string& input) {
    std::vector<int> result;
    std::istringstream iss(input.substr(1, input.size() - 2)); // Remove the brackets
    std::string item;
    while (getline(iss, item, ',')) {
        result.push_back(std::stoi(item));
    }
    return result;
}

int main() {
    std::string line;
    getline(std::cin, line); // Reads the entire input line

    std::vector<int> nums = parseInputVector(line);

    Solution solution;
    int result = solution.minimumArrayLength(nums);

    // Output the result
    std::cout << result << std::endl;

    return 0;
}
