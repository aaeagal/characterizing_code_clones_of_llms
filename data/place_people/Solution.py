from typing import List
import ast
class Solution:
    def numberOfPairs(self, points: List[List[int]]) -> int:
        ans = 0
        for i in range(len(points)):
            x1, y1 = points[i]
            for j in range(len(points)):
                if i == j: continue
                x2, y2 = points[j]
                if x1 >= x2 and y1 <= y2:
                    for k, p in enumerate(points):
                        if k == i or k == j: continue
                        if x1 >= p[0] >= x2 and y1 <= p[1] <= y2:
                            ans -= 1
                            break
                    ans += 1
        return ans
    
def main():
    input_str = input()
    mat = ast.literal_eval(input_str)
    solution = Solution()  # Assuming Solution class is defined elsewhere
    result = solution.numberOfPairs(mat)  # Assuming the Solution class has a method canSortArray
    print(result)

if __name__ == "__main__":
    main()