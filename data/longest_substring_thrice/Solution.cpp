#include <vector>
#include <string>
#include <unordered_map>
#include <map>
#include <sstream>
using namespace std;
class Solution {
public:
    int maximumLength(string s) {
        int ans = -1;
        unordered_map<char, int>mp;
        string aux="";
        for(int i = 0;i<s.length();i++){
            mp[s[i]]++;
        }
        for(auto x : mp){
            int y = x.second;
            char c = x.first;
            map<int, int>map2;
            int length = 0;
            int sum = 0;
            for(int i = 0;i<s.length();i++){
                if(s[i]==c){
                    length++;
                }
                else{
                    if(length){
                        map2[length]++;
                        sum++;
                    }
                    length = 0;
                }
            }
            if(length!=0){
                map2[length]++;
                sum++;
            }
            int size = map2.size();
            for(auto var : map2){
                int r = 3-var.second;
                int l = var.first;
                if(var.second>=3)
                    ans = max(ans, l);
                else if(var.second==2)
                    ans = max(ans, l-1);
                else if(size>1)
                    ans = max(ans, l);
                else if(var.first>2)
                        ans = max(ans, l-2);
                size--;
                }                    
        }
        if(ans==0)
            return -1;
        return ans;
    }
};