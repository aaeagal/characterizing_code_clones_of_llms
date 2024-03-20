import java.util.*;
import java.io.*;
class Solution5 {
public:
    string lastNonEmptyString(string s) {
        vector<int>freq(26,0);
        vector<int>last(26,-1);
        
        for(int i=0; i< s.length() ; i++){
            freq[s[i]-'a']++;
            last[s[i]-'a']=i;
        }
        int maxi = *max_element(freq.begin() , freq.end());
        maxi--;
        string ans;
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxi >0){
                ans +=string(freq[i] - maxi, 'a' + i);
            }
        }
        auto customComparator = [&last](char a, char b) {
            return last[a - 'a'] < last[b - 'a'];
        };
        sort(ans.begin(), ans.end(), customComparator);
        return ans;
    }
};

int main() {
    Solution5 solution;
    string inputString;
    getline(cin, inputString);
    string result = solution.lastNonEmptyString(inputString);
    cout << result << endl;
    return 0;
}

------------------------------------------------------------

#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;
