#include <iostream>
#include <vector>
#include <sstream>
#include <string>
#include <algorithm>

using namespace std;

int f(int n, int p) // function to calculate (ai power bi % 10)
{
    int i = 0;
    int res = 1;

    while (i < p)
    {
        res *= n;
        res %= 10;
        ++i;
    }

    return res;
}

int s(int n, int p, int m)  // function to calculate ((ai power bi % 10) power ci) % mi
{ 
    int i = 0;
    int res = 1;

    while (i < p)
    {
        res *= n;
        res %= m;
        ++i;
    }

    return res;
}

class Solution
{
public:
    vector<int> getGoodIndices(vector<vector<int>> &v, int target)
    {

        int first, sec;

        vector<int> res;
        vector<int> t;

        int a, b, c, m;

        for (int i = 0; i < v.size(); ++i)
        {
            t = v[i];
            a = t[0];
            b = t[1];
            c = t[2];
            m = t[3];

            first = f(a, b);

            sec = s(first, c, m);

            if (sec == target)
                res.push_back(i);
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
    // Assuming Solution class is correctly defined and implements getGoodIndices method
    Solution solution;
    vector<int> result = solution.getGoodIndices(matrix, threshold);

    // Print the result
    cout << "[";
    for (size_t i = 0; i < result.size(); ++i) {
        if (i > 0) cout << ", ";
        cout << result[i];
    }
    cout << "]" << endl;

    return 0;
}