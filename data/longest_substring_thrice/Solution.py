class Solution:
    def maximumLength(self, s: str) -> int:
        from collections import Counter
        check = Counter(s)
        res = -1
        for i in check:
            if check[i]>=3:
                res =1
                break
    
        
        
        
        count = collections.defaultdict(list)
        l = 0
        r = 0
        temp = ''
        while r<len(s):
            if temp=='' or temp[-1]==s[r]:
                temp+=s[r]
            else:
                count[temp[0]].append(len(temp))
                temp = s[r]
                l=r
            r+=1
        
        count[temp[0]].append(len(temp))
        def check_t(sort_l,tar):
            temp = 0 
            for i,j in sort_l:
                if i>=tar:
                    temp+=j*(i-tar+1)
                    if temp>=3:
                        return True
                if i<tar:
                    return False
                    
        
        
        
        #print(count)
        for i in count:
            sort_l = sorted(Counter(count[i]).items(),key = lambda x:-x[0])
            temp = 0
            max_t = sort_l[0][0]
            for j in range(max_t,0,-1):
                if j<=res:
                    break
                if check_t(sort_l,j):
                    res= max(res,j)
                    break
                    
        return res  