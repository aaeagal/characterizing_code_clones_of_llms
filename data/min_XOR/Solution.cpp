#include <vector>
#include <iostream>
#include <string>
#include <sstream>

using namespace std;
class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int n=nums.size();
        int ans=0;
        for(int i=0;i<32;i++){
            int onecnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]&(1<<i))onecnt++;
            }
            int reqbit=k&(1<<i);
            if(reqbit==0){
                if(onecnt%2)ans++;
                //  if req bit is 0 and 1cnt is odd means we need to change 1 bit
            }
            else{
                if(onecnt%2==0)ans++;
                //  if req bit is 1 and 1cnt is even means we need to change 1 bit
            }
        }
        return ans;
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
    long long result = solution.minOperations(nums, k);

    // Output the result
    cout << result << endl;

    return 0;
}