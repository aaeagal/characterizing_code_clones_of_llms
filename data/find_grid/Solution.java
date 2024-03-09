import java.util.Arrays;
import java.util.Scanner;
class Solution {
    int[][] dirs = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
    
    public int[][] resultGrid(int[][] image, int threshold) {
        int r = image.length, c = image[0].length;
        int[][] res = new int[r][c];
        int[][] count = new int[r][c];

        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                int r0 = i - 1, c0 = j - 1;
                int r1 = i + 1, c1 = j + 1;

                // Find if we have valid 3X3 region.
                boolean foundRegion = helper(image, i, j, r0, c0, r1, c1, threshold);
                if (foundRegion) {
                    for (int[] dir : dirs) {
                        int x = dir[0] + i;
                        int y = dir[1] + j;
                        foundRegion &= helper(image, x, y, r0, c0, r1, c1, threshold);
                        if (!foundRegion) break;
                    }
                }

                if (foundRegion) {
                    int sum = 0;
                    for (int k = r0; k <= r1; k++) {
                        for (int l = c0; l <= c1; l++) {
                            sum += image[k][l];
                            count[k][l]++;
                        }
                    }

                    for (int k = r0; k <= r1; k++) {
                        for (int l = c0; l <= c1; l++) {
                            int avg = sum / 9;
                            res[k][l] = (count[k][l] == 1) ? avg : res[k][l] + avg;
                        }
                    }
                } else {
                    for (int k = r0; k <= r1; k++) {
                        for (int l = c0; l <= c1; l++) {
                            if (count[k][l] == 0) res[k][l] = image[k][l];
                        }
                    }
                }
            }
        }

        // Update overlapped averages
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (count[i][j] > 1) {
                    res[i][j] = res[i][j] / count[i][j];
                }
            }
        }

        return res;
    }

    public boolean helper(int[][] image, int i, int j, int r0, int c0, int r1, int c1, int t) {
        for (int[] dir : dirs) {
            int x = dir[0] + i;
            int y = dir[1] + j;
            if (x < r0 || x > r1 || y < c0 || y > c1) continue;
            if (Math.abs(image[x][y] - image[i][j]) > t) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine(); // Read the entire input line
        scanner.close();
        
        // Separate the matrix string from the threshold
        String[] parts = inputLine.split(" ");
        String matrixString = parts[0];
        int threshold = Integer.parseInt(parts[1]);
        
        // Process the matrix string
        String[] rows = matrixString.substring(2, matrixString.length() - 2).split("\\],\\[");
        int[][] matrix = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] numbers = rows[i].split(",");
            matrix[i] = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j].trim());
            }
        }
        
        Solution solution = new Solution();
        int[][] result = solution.resultGrid(matrix, threshold);
        
        // Print the result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(Arrays.toString(result[i]));
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}