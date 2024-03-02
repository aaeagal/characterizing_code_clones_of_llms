class Solution {
  public List<Integer> beautifulIndices(String s, String a, String b, int k) {
    // shift of pattern b
    TreeSet<Integer> shifts = new TreeSet<>(build(s, b));

    List<Integer> result = new ArrayList<>();
    for (int i : build(s, a)) {
      // check existence of j among [i - k, i + k + 1)
      if (!shifts.subSet(i - k, i + k + 1).isEmpty()) {
        result.add(i);
      }
    }

    return result;
  }

  private List<Integer> build(String text, String pattern) {
    List<Integer> shift = new ArrayList<>();

    final int m = text.length();
    final int n = pattern.length();
    for (int i = 0; i <= m - n; i++) {
      boolean match = true;
      for (int j = 0; j < n; j++) {
        if (pattern.charAt(j) != text.charAt(i + j)) {
          match = false;
          break;
        }
      }

      if (match) {
        shift.add(i);
      }
    }

    return shift;
  }
}