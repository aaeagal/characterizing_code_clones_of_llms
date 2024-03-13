import java.util.Scanner;
class Solution {
    public int numberOfPairs(int[][] points) {
        int maxi = 0;
        for(int i=0;i<points.length;i++)
        {
            for(int j=0;j<points.length;j++)
            {
                if(i==j || points[i][0]>points[j][0] || points[i][1]<points[j][1])
                {
                    continue;
                }
                int k = 0;
                for(;k<points.length;k++)
                {
                    if(k==i || k==j)
                    {
                        continue;
                    }
                    if(points[k][1] <= points[i][1] && points[k][1] >= points[j][1] && points[k][0] <= points[j][0] && points[k][0] >= points[i][0]) {
                        break;
                    }
                }
                if(k==points.length)
                {
                    maxi++;
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Reads the entire input line

        // Removing the outer brackets and splitting the input into individual arrays
        String[] rows = input.substring(2, input.length() - 2).split("\\],\\[");

        int[][] mat = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            // Splitting each row into its elements and parsing them as integers
            String[] elements = rows[i].split(",");
            mat[i] = new int[elements.length];
            for (int j = 0; j < elements.length; j++) {
                mat[i][j] = Integer.parseInt(elements[j]);
            }
        }

        Solution solution = new Solution();
        int result = solution.numberOfPairs(mat);
        System.out.println(result);
    }
}