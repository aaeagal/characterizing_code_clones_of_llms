#include <string>
#include <vector>
#include <unordered_map>
#include <sstream>
#include <iostream>
using namespace std;
class Solution {
private:
    struct TrieNode{
        char num;
        unordered_map<int,TrieNode*> map;
        TrieNode(char c): num(c) {};
    };
public:
    int longestCommonPrefix(vector<int>& arr1, vector<int>& arr2) {
        TrieNode* root = new TrieNode(' ');
        for(auto& ch: arr1){
            stringstream ss;
            ss << ch;
            string str = ss.str();
            TrieNode* cur = root;
            for(auto& ch: str){
                if(!cur -> map.count(ch)){
                    TrieNode* tmp = new TrieNode(ch);
                    cur -> map[ch] = tmp;
                }
                cur = cur -> map[ch];
            }
        }
        
        int ans = 0;
        for(auto& ch: arr2){
            stringstream ss;
            ss << ch;
            string str = ss.str();
            TrieNode* cur = root;
            int cnt = 0;
            for(auto& ch: str){
                if(!cur -> map.count(ch)) break;
                cnt += 1;
                cur = cur -> map[ch];
            }
            ans = max(ans,cnt);
        }
        return ans;
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
    int result = solution.longestCommonPrefix(arr1, arr2);

    // Output the result
    cout << result << endl;

    return 0;
}
