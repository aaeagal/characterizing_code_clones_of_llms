class Solution:
    def minMovesToCaptureTheQueen(self, a: int, b: int, c: int, d: int, e: int, f: int) -> int:
        wb = (2 - int(c-d==e-f) - int(c+d==e+f)) if (c+d)%2==(e+f)%2 else 10000
        wr = 2 - int(a==e) - int(b==f)
        if (a==c and c==e and min(b, f) < d < max(b, f)) or (b==d and d==f and min(a, e) < c < max(a, e)):
            wr += 1
        if (a+b==c+d and a+b==e+f and min(c, e) < a < max(c, e)) or (a-b==c-d and a-b==e-f and min(c, e) < a < max(c, e)):
            wb += 1
        return min(wb, wr)