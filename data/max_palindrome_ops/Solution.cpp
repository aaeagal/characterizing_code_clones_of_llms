#include <vector>
#include <string>
#include <algorithm>
using namespace std;
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