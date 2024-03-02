from typing import List
class Solution:
    def resultGrid(self, im: List[List[int]], threshold: int) -> List[List[int]]:
        
        def isRegion(i, j):
            for k in range(i, i+3):
                for l in range(j, j+3):
                    
                    ist = True
                    
                    if k > i:
                        ist = ist and (abs(im[k][l]-im[k-1][l]) <= threshold)
                    if l > j:
                        ist = ist and (abs(im[k][l]-im[k][l-1]) <= threshold) 
                    if k+1 < i+2:
                        ist = ist and (abs(im[k][l]-im[k+1][l]) <= threshold) 
                    if l+1 < j+2:
                        ist = ist and (abs(im[k][l]-im[k][l+1]) <= threshold)
                    
                    if not ist:
                        return False
            return True
        
        counts = [[0 for _ in range(len(im[0]))] for _ in range(len(im))]
        result = [[0 for _ in range(len(im[0]))] for _ in range(len(im))]
        
        
        
        for i in range(len(im)-2):
            for j in range(len(im[0])-2):             
                if isRegion(i, j):
                    # print('isRegion', i, j)
                    curr = 0
                    
                    for k in range(i, i+3):
                        for l in range(j, j+3):
                            curr += im[k][l]
                    
                    for k in range(i, i+3):
                        for l in range(j, j+3):
                            result[k][l] += curr//9
                            counts[k][l] += 1
                # else:
                #     print('not region ',i, j)
        
        # print(counts, result)
        
        for i in range(len(im)):
            for j in range(len(im[0])):
                if counts[i][j] > 0:
                    result[i][j] = result[i][j]//counts[i][j]
                else:
                    result[i][j] = im[i][j]
        
        return result
                    