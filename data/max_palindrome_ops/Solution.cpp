#include <vector>
#include <string>
#include <algorithm>
#include <iostream>
#include <sstream>

using namespace std;
class Solution {
public:
    int maxPalindromesAfterOperations(vector<string> words) {
        int n = words.size();
        vector<int> chrs(26);
        vector<int> lens;
        for(auto& word : words){
            for(char c : word){
                chrs[c-'a']++;
            }
            lens.push_back(word.size());
        }
        int pairs=0,singles =0;
        for(int x : chrs){
            pairs += x/2;
            singles += (x%2);
        }
        sort(lens.begin(), lens.end());
        int ans = 0;
        for(int i=0;i<n;i++){
            int len = lens[i];
            bool odd = (len%2);
            if (odd){
                if (singles)
                    singles--;
                else {
                    pairs--;
                    singles++;
                }
                len--;
            }
            if (pairs >= len/2){
                ans++;
                pairs -= len/2;
            }
        }
        return ans;
    }
};

vector<string> parseInputVector(const string& input) {
    vector<string> result;
    stringstream ss(input.substr(1, input.size() - 2)); // Remove the brackets
    string item;
    while (getline(ss, item, ',')) {
        item.erase(remove(item.begin(), item.end(), '\"'), item.end()); // Remove double quotes
        item.erase(remove(item.begin(), item.end(), ' '), item.end()); // Remove spaces
        result.push_back(item);
    }
    return result;
}

int main() {
    string line;
    getline(cin, line); // Reads the entire input line

    vector<string> words = parseInputVector(line);

    Solution solution;
    int result = solution.maxPalindromesAfterOperations(words);

    // Output the result
    cout << result << endl;

    return 0;
}