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
}