typedef long long ll;
#include <vector>
#include <unordered_map>
#include <cmath>
#include <iostream>
#include <sstream>
#include <string>

using namespace std;
class Solution {
public:
    bool checkPerfectSquare(ll x) {
        
        if(ceil(double(sqrt(x))) == floor(double(sqrt(x)))) return true;
        else return false;
    }
    
    int maximumLength(vector<int>& nums) {
        
        unordered_map<int, int> map;
        
        for(auto x : nums) {
            map[x]++;
        }
        
        int subLen = 1;
        for(ll x : nums) {
            int tempLen = 1;
            
            // Edge case i.e. when the current element is 1. It can 
            // include as many odd number of 1 in its subset.
            if(x == 1) {
                if(map[x] != 1) subLen = max(subLen, map[x] - (map[x]%2 == 0));
                continue;
            }
            
            // First check whether the current no. itself is eligible to be a perfect square.
            while(checkPerfectSquare(x)) {

                // Then check the other condition for it predecessors

                ll sqrtX = sqrt(x);
                if(map.find(sqrtX) != map.end() && map[sqrtX] >=2) {
                    tempLen += 2;
                }
                else {
                    break;
                }

                // Reduce the peak
                x = sqrtX;
            }
            
            subLen = max(subLen, tempLen);
        }
        
        return subLen;
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
    int result = solution.maximumLength(nums);

    // Output the result
    std::cout << result << std::endl;

    return 0;
}