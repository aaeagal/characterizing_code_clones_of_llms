class Solution {
    public int mostFrequentPrime(int[][] mat) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        int m = mat.length, n = mat[0].length;
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                traverse(mat, hm, i, j, -1, 0, m, n); // Top
                traverse(mat, hm, i, j, -1, 1, m, n); // Top-right
                traverse(mat, hm, i, j, 0, 1, m, n); // right
                traverse(mat, hm, i, j, 1, 1, m, n); // bottom-right
                traverse(mat, hm, i, j, 1, 0, m, n); // bottom
                traverse(mat, hm, i, j, 1, -1, m, n); // bottom-left
                traverse(mat, hm, i, j, 0, -1, m, n); // left
                traverse(mat, hm, i, j, -1, -1, m, n); // top-left
            }
        }
        
        int maxfreq = 0;
        for (int freq : hm.values()) {
            maxfreq = Math.max(maxfreq, freq);
        }
        
        int ans = -1;
        for (String k : hm.keySet()) {
            if (hm.get(k) == maxfreq) 
                ans = Math.max(ans, Integer.parseInt(k));
        }
        
        return ans;
    }
    
    private StringBuilder sb = new StringBuilder();
    public void traverse(int[][] mat, HashMap<String, Integer> hm, int curri, int currj, int upi, int upj, int m, int n) {
        if(curri<0 || currj<0 || curri>=m || currj>=n)
            return;
        
        sb.append(mat[curri][currj]);
        int val = Integer.parseInt(sb.toString());
        if(val > 10 && isPrime(val)) {
            hm.put(sb.toString(), hm.getOrDefault(sb.toString(), 0) + 1);
        }
            
        traverse(mat, hm, curri+upi, currj+upj, upi, upj, m, n);
        sb.deleteCharAt(sb.length()-1);
    }
    
    public boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) 
                return false;
        }
        
        return true;
    }
}