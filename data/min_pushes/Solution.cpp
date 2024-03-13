#include <vector>
#include <string>
#include <map>
#include <algorithm>
#include <iostream>

using namespace std;
class Solution {
public:
    int minimumPushes(string s) {
        map<int,int>m;
        for(int i = 0; i < (int)s.size(); i++) {
            m[s[i]]++;
        }
        vector<int>arr;
        for(auto it = m.begin(); it != m.end(); it++) {
            arr.push_back(it->second);
        }
        sort(arr.rbegin(),arr.rend());
        int p = 1,cnt = 0,ans = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(cnt <= 8) {
                ans += (p * arr[i]);
                cnt += 1;
            }
            if(cnt == 8) {
                cnt = 0;
                p += 1;
            }
        }
        return ans;
    }
};

int main() {
    Solution solution;
    string inputString;

    // read only one line from stdin
    getline(cin, inputString);

    // call the solution's function and get the result
    int result = solution.minimumPushes(inputString);

    // output the result to stdout
    cout << result << endl;

    return 0;
}