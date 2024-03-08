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

int main() {
    string inputLine;
    getline(cin, inputLine); // Read the entire line of input

    // Remove spaces to ensure consistent parsing
    inputLine.erase(remove(inputLine.begin(), inputLine.end(), ' '), inputLine.end());

    // Find the start of the target value
    size_t startPosOfTarget = inputLine.find_last_of(']') + 1;
    if (startPosOfTarget == string::npos) {
        cerr << "Error: Could not find the end of the arrays part." << endl;
        return 1;
    }

    string arraysPart = inputLine.substr(1, startPosOfTarget - 2); // Extract arrays part without outer brackets

    string targetStr = inputLine.substr(startPosOfTarget);
    
    if (targetStr.empty()) {
        cerr << "Error: Target string is empty." << endl;
        return 1;
    }

    int target = stoi(targetStr);

    vector<vector<int>> variables;
    stringstream ss(arraysPart);
    string segment;

    // Process each array within the arrays part
    while (getline(ss, segment, ']')) {
        if (!segment.empty() && segment[0] == ',') {
            segment = segment.substr(1); // Remove leading comma
        }
        if (!segment.empty() && segment[0] == '[') {
            segment = segment.substr(1); // Remove leading '['
        }

        stringstream segmentStream(segment);
        vector<int> currentArray;
        string number;
        while (getline(segmentStream, number, ',')) {
            if (!number.empty()) {
                currentArray.push_back(stoi(number));
            }
        }
        
        if (!currentArray.empty()) {
            variables.push_back(currentArray);
        }
    }

    // Assuming Solution class is correctly defined and implements getGoodIndices method
    Solution solution;
    vector<int> result = solution.getGoodIndices(variables, target);

    // Print the result
    cout << "[";
    for (size_t i = 0; i < result.size(); ++i) {
        if (i > 0) cout << ", ";
        cout << result[i];
    }
    cout << "]" << endl;

    return 0;
}