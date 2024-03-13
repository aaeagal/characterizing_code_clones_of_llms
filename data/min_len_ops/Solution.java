import java.util.*;
class Solution {
     private int gcd(int A,int B) {
        while (B!=0) {
            int temp=B;
            B=A%B;
            A=temp;
        }
        return A;
    }
    public int minimumArrayLength(int[] nums) {
        Arrays.sort(nums);
        int G=nums[0];
        for (int i=1;i<nums.length;i++) {
            G=gcd(G,nums[i]);
        }
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==G)
                count++;
        }
        return Math.max(1,(count+1)/2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Reads the entire input line

        // Removing the brackets and parsing the array part
        String[] numsAsString = input.substring(1, input.length() - 1).split(",");
        int[] nums = new int[numsAsString.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numsAsString[i].trim());
        }

        Solution solution = new Solution();
        int result = solution.minimumArrayLength(nums);

        // Output the result
        System.out.println(result);
    }
}