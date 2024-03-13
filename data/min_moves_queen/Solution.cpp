#include <algorithm>
#include <iostream>
#include <vector>
#include <string>

using namespace std;
class Solution {
public:
    int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        // (a,b)
        // (c,d)
        // (e,f)
        int rook = 2, bishop = 2;
        if (a == e || b == f) { // rook: is inline
            // BlockingCase1
            if (a == e and c == a) {
                if (b < d and d < f) return 2;
                if (b > d and d > f) return 2;
            }
            else if (b == f and d == b) {
                if (a < c and c < e) return 2;
                if (a > c and c > e) return 2;
            } 
            rook = 1;
        }
        if (abs(c-e) == abs(d-f)) { // bishop: is diagonal
            // BlockingCase2
            if (abs(a-c) == abs(b-d)) {
                if (c < a and a < e) { 
                    if (d < b and b < f) return 2;
                    if (d > b and b > f) return 2;
                }
                if (c > a and a > e) {
                    if (d < b and b < f) return 2;
                    if (d > b and b > f) return 2;
                }
            }
            bishop = 1;
        }
        return min(rook, bishop);
    }
};

int main() {
    Solution s;
    int a, b, c, d, e, f;
    cin >> a >> b >> c >> d >> e >> f;
    int result = s.minMovesToCaptureTheQueen(a, b, c, d, e, f);
    cout << result << endl;
}
