#include <vector>
#include <unordered_set>
#include <algorithm>
#include <iostream>
#include <sstream>
#include <string>

using namespace std;
class Solution {
public:
    int maximizeSquareArea(int m, int n, vector<int>& H, vector<int>& V) {
        int mod = 1E9 + 7;
        
        // also push boundries of vertical and horizontal frence
        H.push_back(1), H.push_back(m);
        V.push_back(1), V.push_back(n);
        
        // sort all horizontal frence and vertical frence
        sort(H.begin(), H.end());
        sort(V.begin(), V.end());
        
        // calculate all possible horizontal length for area with removing some h_frence
        unordered_set<int> h_len;
        for(int i = 0; i < H.size(); i++) {
            for(int j = i + 1; j < H.size(); j++) {
                h_len.insert(H[j] - H[i]);
            }
        }
        
        long long ans = -1;
        
         // calculate all possible vertical length for area with removing some h_frence
        for(int i = 0; i < V.size(); i++) {
            for(int j = i + 1; j < V.size(); j++) {
                int v_len = V[j] - V[i];
                // horizontal length match to vertical length then we make square with length v_len
                if(h_len.count(v_len)) ans = max(ans, v_len * 1ll * v_len);
            }
        }
        
        
        return ans % mod;
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
    int m, n;
    char comma; // To consume the commas in the input
    std::cin >> m >> comma >> n >> comma;

    std::string hStr, vStr;
    std::cin >> hStr >> vStr; // Read the vector strings

    std::vector<int> H = parseInputVector(hStr);
    std::vector<int> V = parseInputVector(vStr);

    Solution solution;
    int result = solution.maximizeSquareArea(m, n, H, V);

    // Output the result
    std::cout <<  result << std::endl;

    return 0;
}