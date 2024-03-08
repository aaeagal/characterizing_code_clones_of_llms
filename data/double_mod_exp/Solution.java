import java.util.*;
class Solution {
    //returns (a ^ b) % mod
    private int power (int a, int b, int mod) {
        if (b == 0)
                return 1;
        if (b % 2 == 0)
            return power((a * a) % mod, b / 2, mod);
        else
            return (a * power((a * a) % mod , b / 2, mod)) % mod;
    }
    
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < variables.length; i++) {
            int a = variables[i][0], b = variables[i][1], c = variables[i][2], m = variables[i][3];
            int calculated = power(power(a, b, 10), c, m);
            if (calculated == target)
                result.add(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // Extract the part containing the arrays and the target value separately
        String[] inputParts = input.split("] ");
        String arraysPart = inputParts[0] + "]";
        int target = Integer.parseInt(inputParts[1]);
        
        // Remove the very first and last brackets and then split the arrays
        arraysPart = arraysPart.substring(2, arraysPart.length() - 2); // Remove [[ and ]]
        String[] arrayStrings = arraysPart.split("\\],\\[");
        
        List<int[]> variables = new ArrayList<>();
        for (String arrayString : arrayStrings) {
            String[] numberStrings = arrayString.split(",");
            int[] numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i].trim());
            }
            variables.add(numbers);
        }

        // Assuming the existence of a Solution class and a getGoodIndices method
        Solution solution = new Solution();
        // The next line is pseudocode, adjust according to your actual method signature and implementation
        List<Integer> result = solution.getGoodIndices(variables.toArray(new int[variables.size()][]), target);

        System.out.println(Arrays.toString(result.toArray()));

        // Print results
        
    }
}