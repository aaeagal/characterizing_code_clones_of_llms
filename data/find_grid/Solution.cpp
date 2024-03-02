#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

class Solution {
    vector<vector<int>> temp;
public:
    bool isreg(int r, int c, int k){
        for(int i=r;i<(r+3);i++){
            for(int j=c;j<(c+3);j++){
                if(j<(c+2) && abs(temp[i][j] - temp[i][j+1])>k)
                    return false;
                if(i<(r+2) && abs(temp[i][j] - temp[i+1][j]) > k)
                    return false;
            }
        }
        return true;
    }
    
    int calcavg(int r, int c){
        int avg=0;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++)
                avg += temp[i][j];
        }
        return avg/9;
    }
    
    vector<vector<int>> resultGrid(vector<vector<int>>& image, int threshold) {
        temp = image;
        int m = image.size();
        int n = image[0].size();
        vector<vector<int>> res(m, vector<int>(n, -1));
        vector<vector<int>> div(m, vector<int>(n, 1));  // divisor matrix as the we need to be precise while calculating the average
        for(int i=0;i<=m-3;i++){
            for(int j=0;j<=n-3;j++){
                if(isreg(i,j, threshold)){  // calculate if it is a region
                    int avg = calcavg(i,j);     // calculate the average
                    for(int ti = i;ti<(i+3);ti++){
                        for(int tj=j;tj<(j+3);tj++)
                            if(res[ti][tj]!=-1){
                                res[ti][tj] = (res[ti][tj]+avg);
                                div[ti][tj]++;
                            }
                            else{
                                res[ti][tj] = avg;
                                div[ti][tj]=1;
                            }
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(res[i][j]==-1){
                    res[i][j]=image[i][j];
                }
                else{
                    res[i][j] = res[i][j]/div[i][j];
                }
            }
        }
        
        return res;
    }
};