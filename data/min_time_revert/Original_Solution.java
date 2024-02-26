class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int result = 1;
        for (int i = k; i < word.length(); i = i + k) {
            if (word.startsWith(word.substring(i))) {
                break;
            }
            result++;
        }
        return result;
    }
}