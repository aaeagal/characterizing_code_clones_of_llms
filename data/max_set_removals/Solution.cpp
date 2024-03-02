#include <vector>
#include <unordered_set>
using namespace std;
class Solution {
public:
    int maximumSetSize(vector<int>& A, vector<int>& B) {
        int n=A.size();
        unordered_set<int>s1(A.begin(),A.end());
        unordered_set<int>s2(B.begin(),B.end());
        int i=0,j=0;
        unordered_set<int>st;
        // Add all unique elements first

        for(auto&it:s1){
            if(i==n/2) break;
            if(s2.find(it)==s2.end()) {
                st.insert(it);
                i++;
            }
        }
        for(auto&it:s2){
            if(j==n/2) break;
            if(s1.find(it)==s1.end()) {
                st.insert(it);
                j++;
            }
        }

        //If we still have some elements left, add duplicates

        if(i<n/2){
            for(auto&it:s1){
                if(i==n/2) break;
                if(s2.find(it)!=s2.end()) {
                    st.insert(it);
                    // to add it in different n/2 set from s2
                    s2.erase(it);
                    i++;
                }
            }
        }
        if(j<n/2){
            for(auto&it:s2){
                if(j==n/2) break;
                if(s1.find(it)!=s1.end()) {
                    st.insert(it);
                    j++;
                }
            }
        }
        return st.size();
    }
};