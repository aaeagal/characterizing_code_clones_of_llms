import java.util.*;
import java.util.stream.*;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        
        // Assuming the input format is: 4, 3, [2,3], [2]
        // Splitting the input string around the commas followed by space
        String[] parts = input.split(",\\s*(?![^\\[]*\\])"); // Adjusted regex
        
        // Parsing m and n
        int m = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);

        // Parsing hFences and vFences
        // The regex adjustment is to not split on commas inside the square brackets
        String[] hFencesStr = parts[2].substring(1, parts[2].length() - 1).split(",");
        int[] hFences = Arrays.stream(hFencesStr).map(String::trim).mapToInt(Integer::parseInt).toArray();
        
        String[] vFencesStr = parts[3].substring(1, parts[3].length() - 1).split(",");
        int[] vFences = Arrays.stream(vFencesStr).map(String::trim).mapToInt(Integer::parseInt).toArray();
        
        Solution solution = new Solution();
        int result = solution.maximizeSquareArea(m, n, hFences, vFences);

        System.out.println(result);
    }
}
