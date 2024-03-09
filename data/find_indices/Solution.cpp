#include <vector>
#include <string>
#include <cmath>
#include <iostream>
#include <sstream>

using namespace std;
class Solution {
public:
    vector<int> beautifulIndices(string s, string a, string b, int k) {
        vector<int> pa,pb;
        int n = s.length();
        for(int i = 0; i<=n-a.length(); i++){
            if(a.length()>s.length()) break;
            string x = "";
            x = s.substr(i,a.length());
            if(x == a){
                pa.push_back(i);
            }
            
        }
        for(int i = 0; i<=n-b.length(); i++){
            if(b.length()>s.length()) break;
            string x = "";
            x = s.substr(i,b.length());
            if(x == b){
                pb.push_back(i);
            }
        }
        
        vector<int> ans;
        int i = 0,j = 0;
        while(i<pa.size() && j<pb.size()){
            if(abs(pa[i]-pb[j]) <= k) ans.push_back(pa[i]),i++;
            else if(pa[i]<pb[j]) i++;
            else j++;
        }
        
        return ans;
    }
};

int main() {
    string input;
    getline(cin, input); // Reads the entire line of input

    // Find the last two spaces to correctly extract s, a, b, and k
    int lastSpaceIndex = input.find_last_of(' ');
    int secondLastSpaceIndex = input.find_last_of(' ', lastSpaceIndex - 1);

    // Extracting k from the input
    int k;
    try {
        k = stoi(input.substr(lastSpaceIndex + 1));
    } catch (const std::invalid_argument& e) {
        cerr << "Invalid argument for k: " << e.what() << endl;
        return -1; // Exit the program
    }

    // Extracting b (without k)
    string b = input.substr(secondLastSpaceIndex + 1, lastSpaceIndex - secondLastSpaceIndex - 1);

    // Removing b and k parts from input to get s and a
    string sAndA = input.substr(0, secondLastSpaceIndex);
    int firstSpaceIndexAfterS = sAndA.find_last_of(' ');

    // Extracting s and a
    string s = sAndA.substr(0, firstSpaceIndexAfterS);
    string a = sAndA.substr(firstSpaceIndexAfterS + 1);

    Solution solution;
    vector<int> beautifulIndices = solution.beautifulIndices(s, a, b, k);

    // Print the result as a list
    cout << "[";
    for (int i = 0; i < beautifulIndices.size(); i++) {
        cout << beautifulIndices[i];
        if (i != beautifulIndices.size() - 1) {
            cout << ", ";
        }
    }
    cout << "]" << endl;
}