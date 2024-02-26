class Solution {
  public int minimumPushes(String word) {
    int[] count = new int[26];
    for (char c : word.toCharArray()) {
      count[c - 'a']++;
    }

    int push = 0;
    Arrays.sort(count);
    for (int i = 0; i < 26; i++) {
      push += count[25 - i] * (i / 8 + 1);
    }

    return push;
  }
}