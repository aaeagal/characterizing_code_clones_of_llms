from collections import Counter,defaultdict

class Solution(object):
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
        