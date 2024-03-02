import java.util.*;
class Solution {
  public int minimumOperationsToMakeEqual(int x, int y) {
    if (x <= y) {
      return y - x;
    }
    Set<Integer> seen = new HashSet<>();
    seen.add(x);
    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(x);
    int depth = 0;
    while (!queue.isEmpty()) {
      for (int i = queue.size(); i > 0; i--) {
        int p = queue.poll();
        if (p == y) {
          return depth;
        }

        if (seen.add(p + 1)) {
          queue.offer(p + 1);
        }

        if (seen.add(p - 1) && p - 1 > 0) {
          queue.offer(p - 1);
        }

        if (p % 5 == 0 && seen.add(p / 5)) {
          queue.offer(p / 5);
        }

        if (p % 11 == 0 && seen.add(p / 11)) {
          queue.offer(p / 11);
        }
      }
      depth++;
    }

    return -1;
  }
}