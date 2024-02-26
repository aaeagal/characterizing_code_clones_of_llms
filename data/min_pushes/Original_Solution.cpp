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