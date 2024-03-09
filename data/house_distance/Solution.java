import java.util.*;
class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        if (x == y) {
            x = -1;
            y = -1;
        }
        int[] result = new int[n];
        for (int i = 1;i <= n;i++) {
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{i, 0});
            int[] distances = new int[n];
            Arrays.fill(distances, Integer.MAX_VALUE);
            Set<Integer> visited = new HashSet<>();
            while (!queue.isEmpty()) {
                int[] data = queue.poll();
                int node = data[0];
                int steps = data[1];
                distances[node-1] = Math.min(distances[node-1], steps);
                if (visited.contains(node)) {
                    continue;
                }
                visited.add(node);
                if (node == x || node == y) {
                    queue.add(new int[]{node == x ? y : x, steps+1});
                }
                
                if (node + 1 <= n) {
                    queue.add(new int[]{node+1, steps+1});
                }
                if (node - 1 >= 1) {
                    queue.add(new int[]{node-1, steps+1});
                }       
            }
            for (int val : distances) {
                if (val != 0)
                    result[val-1]++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reads the three integers from a single line
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Solution solution = new Solution();
        int[] result = solution.countOfPairs(n, x, y);

        // Output the result
        System.out.println(Arrays.toString(result));
    }
}