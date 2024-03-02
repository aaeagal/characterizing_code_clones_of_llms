class Solution:
    def longestCommonPrefix(self, arr11: List[int], arr21: List[int]) -> int:
        d = defaultdict(int)
        p = defaultdict(int)
        arr1 = list(set(arr11))
        arr2 = list(set(arr21))
        count = 0
        for i in arr1:
            if d[i]==0:
                d[i]+=1
                a = str(i)
                if len(a)>1:
                    t = len(a)-1
                    while t>0:
                        if d[int(a[:t])]>0:
                            break
                        else:
                            d[int(a[:t])]+=1
                            t-=1
        for i in arr2:
            if p[i]==0:
                p[i]+=1
                a = str(i)
                if d[i]>0:
                    count = max(count,len(a))
                elif len(a)>1:
                    t = len(a)-1
                    while t>0:
                        if d[int(a[:t])]>0:
                            count = max(count,len(a[:t]))
                            break
                        else:
                            p[int(a[:t])]+=1
                            t-=1
        return count