class Solution {
  private static final int modulo = (int) 1e9 + 7;

  public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
    Set<Integer> seen = new HashSet<>();
    int l = hFences.length + 2;
    int[] h = Arrays.copyOf(hFences, l);
    // add both boundary
    h[l - 2] = 1;
    h[l - 1] = m;
    for (int i = 0; i < l; i++) {
      for (int j = i + 1; j < l; j++) {
        seen.add(Math.abs(h[j] - h[i]));
      }
    }

    l = vFences.length + 2;
    int[] v = Arrays.copyOf(vFences, l);
    // add both boundary
    v[l - 2] = 1;
    v[l - 1] = n;

    int gap = 0;
    // check vertical fences
    for (int i = 0; i < l; i++) {
      for (int j = i + 1; j < l; j++) {
        int distance = Math.abs(v[j] - v[i]);
        if (seen.contains(distance)) {
          gap = Math.max(gap, distance);
        }
      }
    }

    if (gap == 0) {
      return -1;
    }

    return (int) ((long) gap * gap % modulo);
  }
}
