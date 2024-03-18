import java.util.*;
class Solution1(object):
    def lastNonEmptyString(self, s):
        
        d = Counter(s)
        d_list = sorted(d.items(), key=lambda x: x[1], reverse=True)
        
        highest = d_list[0][1]
        d = defaultdict()
        ans = ""
        
        for key, val in d_list:
            if val == highest:
                d[key]=val
            else:
                break

        for i in s:
            if i in d:
                if d[i]==1:
                    ans += i
                d[i]-=1

        return ans
        
def main():
    sol = Solution1()
    # read only one line
    s = input().strip()
    print(sol.lastNonEmptyString(s))
    # end the program
    sys.exit(0)

if __name__ == "__main__":
    main()