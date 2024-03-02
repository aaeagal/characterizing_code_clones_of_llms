class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int[] freq = new int[26];
        for(String word: words) {
            pq.add(word.length());
            for(char ch: word.toCharArray()) {
                freq[ch - 'a']++;
            }
        }
        
        int cnt = 0;
        while(!pq.isEmpty()) {
            int n = pq.poll();
            
            if(n%2 != 0) {
                for(int i=0; i<26; i++) {
                    if(freq[i]%2 != 0) {
                        n -= 1;
                        freq[i]-=1;
                        if(n == 0) cnt++;
                        break;
                    }
                }
            }
            
            if(n != 0) {
                for(int i=0; i<26; i++) {
                    if(freq[i]>=n) {
                        cnt++;
                        freq[i] -= n;
                        break;
                    } else {
                        int nc = freq[i]/2;
                        n -= 2*nc;
                        freq[i] -= 2*nc;
                    }
                }
            }
        }
        
        return cnt;
    }
}