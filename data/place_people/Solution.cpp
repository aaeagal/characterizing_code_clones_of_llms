#include <vector>
#include <algorithm>
#include <iostream>
#include <sstream>
#include <string>
using namespace std;
class Solution {
public:
    int numberOfPairs(vector<vector<int>>& points) {
        int res=0;
        sort(points.begin(), points.end());
        for(int i=0 ; i<points.size() ; ++i) {
            for(int j=i+1 ; j<points.size() ; ++j) {
                
                int x1=points[i][0], y1=points[i][1];
                int x2=points[j][0], y2=points[j][1];
                
                if(x1<=x2 && y1>=y2) {}
                else if(x1>=x2 && y1<=y2) {
                    swap(x1,x2), swap(y1,y2);
                }
                else continue;
                
                bool flag=true;
                for(int k=0 ; k<points.size() ; ++k) {
                    
                    if(k==i || k==j) continue;
                    
                    int midx=points[k][0], midy=points[k][1];
                    
                    if(x1<=midx && x2>=midx && y2<=midy && y1>=midy) {
                        flag=false;
                        break;
                    }
                    
                }
                if(flag) {
                    res++;
                }
            }
        }
        return res;
    }
};

vector<vector<int>> parseInputMatrix(string input) {
    vector<vector<int>> matrix;
    stringstream ss(input.substr(1, input.size() - 2)); // Remove outer brackets
    string row;
    while (getline(ss, row, ']')) {
        if (row[0] == ',') row = row.substr(2); // Handle comma at the start
        vector<int> rowVec;
        stringstream rs(row.substr(1)); // Remove leading '['
        string num;
        while (getline(rs, num, ',')) {
            rowVec.push_back(stoi(num));
        }
        matrix.push_back(rowVec);
        ss.ignore(1); // Ignore the comma between rows
    }
    return matrix;
}

int main() {
    string input;
    getline(cin, input); // Assuming the input is [[1,1],[9,9],[1,1]]

    vector<vector<int>> mat = parseInputMatrix(input);

    Solution solution;
    int result = solution.numberOfPairs(mat);
    cout << result << endl;

    return 0;
}