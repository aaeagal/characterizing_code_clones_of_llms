class Solution:
    def minimumPushes(self, word: str) -> int:
        count = 1 
        d = {}
        g = Counter(word)
        count1 = 0
        l = sorted(g.items(),key = lambda x:x[1])
        l = l[::-1]
        for i in range(len(l)):
            if count<9:
                d[l[i][0]] = 1
                count+=1
            elif count<17:
                d[l[i][0]] = 2
                count+=1
            elif count <25:
                d[l[i][0]]=3
                count+=1
            else:
                d[l[i][0]] = 4
                count+=1
        for i in word:
            count1+= d[i]
        return count1
            