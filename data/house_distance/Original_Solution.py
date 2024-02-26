class Solution:
    def countOfPairs(self, n: int, x: int, y: int) -> List[int]:
        vis=set()
        if(x==y or x+1==y or y+1==x):
            y=float('inf')
            
        ans=[0 for i in range(n)]
        def do(cur):
            st=[cur]
            lv=0
            while(st):
                o=[]
                for i in st:
                    if(i-1>0 and i-1 not in vis):
                        ans[lv]+=1
                        o.append(i-1)
                        vis.add(i-1)
                    if(i+1<=n and i+1 not in vis):
                        ans[lv]+=1
                        o.append(i+1)
                        vis.add(i+1)
                    if(i==x):
                        if(y not in vis):
                            ans[lv]+=1
                            o.append(y)
                            vis.add(y)
                    if(i==y):
                        if(x not in vis):
                            ans[lv]+=1
                            o.append(x)
                            vis.add(x)
                st=o
                lv+=1
                # print(o,lv,cur)
                        
                    
        for i in range(1,n+1):
            vis={float('inf'),i}
            do(i)
        return ans
    