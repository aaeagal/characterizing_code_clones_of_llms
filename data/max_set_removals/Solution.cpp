#include <vector>
#include <unordered_set>
#include <iostream>
#include <sstream>
#include <string>

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
std::vector<int> parseInputVector(const std::string& input) {
    std::vector<int> result;
    std::istringstream iss(input.substr(1, input.size() - 2)); // Remove the brackets
    std::string item;
    while (getline(iss, item, ',')) {
        result.push_back(std::stoi(item));
    }
    return result;
}

int main() {
    std::string line;
    getline(std::cin, line); // Reads the entire input line

    // Splitting the input line into two parts: two vectors
    size_t mid = line.find("] [");
    std::string vecA = line.substr(0, mid+1);
    std::string vecB = line.substr(mid+2);
    
    std::vector<int> A = parseInputVector(vecA);
    std::vector<int> B = parseInputVector(vecB);

    Solution solution;
    int result = solution.maximumSetSize(A, B);

    // Output the result
    std::cout << result << std::endl;

    return 0;
}