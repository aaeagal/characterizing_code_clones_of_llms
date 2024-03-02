class Solution {
public:
    int minimumOperationsToMakeEqual(int x, int y) {
        if(y>x) return y-x;   
        queue<pair<int,int>>q;
        unordered_set<int>st;
        st.insert(x);
        q.push({x,0});
        while(q.size()){
            int curr=q.front().first;
            int dis=q.front().second;
            int t;
            q.pop();
            if(curr==y) return dis;
            if(curr>1e4 || curr<0) continue; 
            if(curr%11==0){
                if(st.find(curr/11)==st.end()) {
                    q.push({curr/11,dis+1});
                    st.insert(curr/11);
                }
            }
            if(curr%5==0){
                if(st.find(curr/5)==st.end()) {
                    st.insert(curr/5);
                    q.push({curr/5,dis+1});
                }
            }
            if(st.find(curr+1)==st.end()) {
                q.push({curr+1,dis+1});
                st.insert(curr+1);
            }
            if(st.find(curr-1)==st.end()) {
                q.push({curr-1,dis+1});
                st.insert(curr-1);
            }
        }
        return -1;
    }
};