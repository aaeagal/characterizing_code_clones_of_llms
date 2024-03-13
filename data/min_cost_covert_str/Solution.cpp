#include <utility>
#include <vector>
#include <string>
#include <functional>
#include <climits>
#include <iostream>
#include <queue>
#include <sstream>
using namespace std;
typedef pair<int,int> pii;
class Solution {
public:
    long long minimumCost(string source, string target, vector<char>& O, vector<char>& C, vector<int>& cost) {
        vector<vector<pii>> adj(26);
        for (int i = 0; i < O.size(); i++) {
            adj[O[i]-'a'].push_back({C[i]-'a', cost[i]});
        }
        
        vector<vector<int>> memo(26, vector<int>(26, -1));
        
        function<int(int,int)> dijkstra = [&](int s, int e) {
            if (memo[s][e] != -1) return memo[s][e];
            
            int n = adj.size();
            vector<int> dist(n, INT_MAX);
            dist[s] = 0;

            priority_queue<pii, vector<pii>, greater<pii>> minq;
            minq.push({0, s});

            int u, v, w;
            while (!minq.empty()) {
                auto p = minq.top(); minq.pop();
                u = p.second;

                if (dist[u] < p.first)
                    continue;

                if (u == e)
                    return memo[s][e] = p.first;

                for (auto& node: adj[u]) {
                    v = node.first, w = node.second;
                    if (dist[v] > dist[u] + w) {
                        dist[v] = dist[u] + w;
                        minq.push({dist[v], v});
                    }
                }
            }
            return memo[s][e] = (dist[e] == INT_MAX ? -2 : dist[e]);
        };
        
        long long res = 0;
        for (int i = 0; i < source.size(); i++) {
            if (source[i] != target[i]) {
                int c = dijkstra(source[i]-'a', target[i]-'a');
                if (c < 0) return -1;
                res += c;
            }
        }
        return res;
    }
};

vector<char> parseCharVector(string input) {
    vector<char> result;
    stringstream ss(input.substr(1, input.size() - 2)); // Remove the brackets.
    string item;
    while (getline(ss, item, ',')) {
        item.erase(remove(item.begin(), item.end(), '\"'), item.end()); // Remove quotes.
        item.erase(remove(item.begin(), item.end(), ' '), item.end()); // Remove spaces.
        if (!item.empty()) {
            result.push_back(item[0]);
        }
    }
    return result;
}

vector<int> parseIntVector(string input) {
    vector<int> result;
    stringstream ss(input.substr(1, input.size() - 2)); // Remove the brackets.
    string item;
    while (getline(ss, item, ',')) {
        result.push_back(stoi(item));
    }
    return result;
}

int main() {
    string source, target;
    cin >> source >> target;

    string temp;
    vector<char> O, C;
    vector<int> cost;

    cin >> temp; // Read the vector as a string.
    O = parseCharVector(temp);

    cin >> temp; // Read the next vector.
    C = parseCharVector(temp);

    cin >> temp; // Read the cost vector.
    cost = parseIntVector(temp);

    Solution solution;
    long long result = solution.minimumCost(source, target, O, C, cost);

    cout << result << endl;

    return 0;
}