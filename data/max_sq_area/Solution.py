from collections import defaultdict
from typing import List
import ast
class Solution:
    def maximizeSquareArea(self, m: int, n: int, hFences: List[int], vFences: List[int]) -> int:
        sects = defaultdict(list)
        hFences.insert(0, 1); hFences.append(m)
        vFences.insert(0, 1); vFences.append(n)
        hFences.sort(); vFences.sort()
        answer = -1
        for h in hFences:
            for v in vFences:
                if h-v not in sects:
                    sects[h-v] = [h, v]
                else:
                    answer = max(answer, (h-sects[h-v][0]) * (v-sects[h-v][1]))
        if answer == -1: return -1
        return answer % 1000000007

def main():
    input_str = input()
    input_list = ast.literal_eval(input_str)

    m = input_list[0]
    n = input_list[1]
    hFences = input_list[2]
    vFences = input_list[3]

    sol = Solution()
    behavior = sol.maximizeSquareArea(m, n, hFences, vFences)

    print(behavior)
   

if __name__ == "__main__":
    main()