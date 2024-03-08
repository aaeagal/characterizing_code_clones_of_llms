#include <iostream>
#include <sstream>
// Added above for main function
class Solution {
public:
    long long flowerGame(int n, int m) {
        long long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long long AEven = n / 2;
        long long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
};
int main() {
    Solution solution;
    std::string line;
    int n, m;

    // Continuously read input lines until EOF
    while (std::getline(std::cin, line)) {
        std::istringstream iss(line);

        // Read the two integers
        iss >> n >> m;

        // Call the solution function and print the result
        std::cout << solution.flowerGame(n, m) << std::endl;

    }

    return 0;
}
