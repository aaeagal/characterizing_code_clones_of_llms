
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