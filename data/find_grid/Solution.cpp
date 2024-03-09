#include <vector>
#include <algorithm>
#include <cmath>
#include <iostream>
#include <sstream>
#include <string>

using namespace std;

class Solution {
    vector<vector<int>> temp;
public:
    bool isreg(int r, int c, int k){
        for(int i=r;i<(r+3);i++){
            for(int j=c;j<(c+3);j++){
                if(j<(c+2) && abs(temp[i][j] - temp[i][j+1])>k)
                    return false;
                if(i<(r+2) && abs(temp[i][j] - temp[i+1][j]) > k)
                    return false;
            }
        }
        return true;
    }
    
    int calcavg(int r, int c){
        int avg=0;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++)
                avg += temp[i][j];
        }
        return avg/9;
    }
    
    vector<vector<int>> resultGrid(vector<vector<int>>& image, int threshold) {
        temp = image;
        int m = image.size();
        int n = image[0].size();
        vector<vector<int>> res(m, vector<int>(n, -1));
        vector<vector<int>> div(m, vector<int>(n, 1));  // divisor matrix as the we need to be precise while calculating the average
        for(int i=0;i<=m-3;i++){
            for(int j=0;j<=n-3;j++){
                if(isreg(i,j, threshold)){  // calculate if it is a region
                    int avg = calcavg(i,j);     // calculate the average
                    for(int ti = i;ti<(i+3);ti++){
                        for(int tj=j;tj<(j+3);tj++)
                            if(res[ti][tj]!=-1){
                                res[ti][tj] = (res[ti][tj]+avg);
                                div[ti][tj]++;
                            }
                            else{
                                res[ti][tj] = avg;
                                div[ti][tj]=1;
                            }
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(res[i][j]==-1){
                    res[i][j]=image[i][j];
                }
                else{
                    res[i][j] = res[i][j]/div[i][j];
                }
            }
        }
        
        return res;
    }
};

vector<vector<int>> stringToMatrix(string input) {
    vector<vector<int>> result;
    istringstream iss(input);
    string row;
    // Skip the initial '['
    getline(iss, row, '[');
    while(getline(iss, row, '[')) {
        vector<int> rowVector;
        stringstream ss(row);
        string value;
        while(getline(ss, value, ',')) {
            // Remove potential trailing ']' characters
            value.erase(remove(value.begin(), value.end(), ']'), value.end());
            if(!value.empty())
                rowVector.push_back(stoi(value));
        }
        if(!rowVector.empty())
            result.push_back(rowVector);
    }
    return result;
}

int main() {
    string input;
    getline(cin, input); // Read the entire line
    size_t pos = input.find_last_of(' '); // Find the position of the last space character
    string matrixString = input.substr(0, pos); // Extract the matrix part of the input
    int threshold = stoi(input.substr(pos + 1)); // Extract the threshold part of the input

    vector<vector<int>> matrix = stringToMatrix(matrixString);
    Solution solution;
    vector<vector<int>> result = solution.resultGrid(matrix, threshold);

    // Print the result
    cout << "[" ;
    for (size_t i = 0; i < result.size(); ++i) {
        cout << "[";
        for (size_t j = 0; j < result[i].size(); ++j) {
            cout << result[i][j];
            if (j < result[i].size() - 1) cout << ", ";
        }
        cout << "]";
        if (i < result.size() - 1) cout << ", ";
    }
    cout << "]" << endl;

    return 0;
}