#include <iostream>
#include <unordered_map>
#include <queue>
#include <cmath>
#include <sstream>
#include <string>
using namespace std;

class Solution {
public:
    bool prime(int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    int mostFrequentPrime(vector<vector<int>>& mat) {
        unordered_map<int, int> map;
        int n = mat.size();
        int m = mat[0].size();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = 0;

                for (int row = i; row < n; row++) {
                    num = num * 10 + mat[row][j];
                    if (num >= 10 && prime(num)) {
                        map[num]++;
                    }
                }

                num = 0;
                for (int row = i; row >= 0; row--) {
                    num = num * 10 + mat[row][j];
                    if (num >= 10 && prime(num)) {
                        map[num]++;
                    }
                }

                num = 0;
                for (int col = j; col < m; col++) {
                    num = num * 10 + mat[i][col];
                    if (num >= 10 && prime(num)) {
                        map[num]++;
                    }
                }

                num = 0;
                for (int col = j; col >= 0; col--) {
                    num = num * 10 + mat[i][col];
                    if (num >= 10 && prime(num)) {
                        map[num]++;
                    }
                }

                num = 0;
                for (int row = i, col = j; row < n && col < m; row++, col++) {
                    num = num * 10 + mat[row][col];
                    if (num >= 10 && prime(num)) {
                        map[num]++;
                    }
                }

                num = 0;
                for (int row = i, col = j; row >= 0 && col >= 0; row--, col--) {
                    num = num * 10 + mat[row][col];
                    if (num >= 10 && prime(num)) {
                        map[num]++;
                    }
                }

                num = 0;
                for (int row = i, col = j; row < n && col >= 0; row++, col--) {
                    num = num * 10 + mat[row][col];
                    if (num >= 10 && prime(num)) {
                        map[num]++;
                    }
                }

                num = 0;
                for (int row = i, col = j; row >= 0 && col < m; row--, col++) {
                    num = num * 10 + mat[row][col];
                    if (num >= 10 && prime(num)) {
                        map[num]++;
                    }
                }
            }
        }

        priority_queue<pair> pq;

        for (auto it = map.begin(); it != map.end(); ++it) {
            pq.push(pair(it->second, it->first));
        }

        if (pq.empty()) {
            return -1;
        }
        return pq.top().num;
    }

private:
    struct pair {
        int feq;
        int num;

        pair(int feq, int num) : feq(feq), num(num) {}

        bool operator<(const pair& other) const {
            if (feq != other.feq) {
                return feq < other.feq;
            } else {
                return num < other.num;
            }
        }
    };
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
    int result = solution.mostFrequentPrime(mat);
    cout << result << endl;

    return 0;
}