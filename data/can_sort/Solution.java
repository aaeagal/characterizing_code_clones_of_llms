import java.util.*;
class Solution {
    public boolean canSortArray(int[] a) {
        int[] a2 = new int[a.length];
        int n = a.length;
        for(int i=0; i<n; i++){
            a2[i] = a[i];
        }
        Arrays.sort(a2);
        if(Arrays.equals(a,a2)) return true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                int x = Integer.bitCount(a[j]);
                int y = Integer.bitCount(a[j + 1]);
                if(x==y && a[j] > a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1] = t;
                }
            }
        }
        return Arrays.equals(a,a2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");
        List<Integer> nums = new ArrayList<>();
        for (String number : numbers) {
            nums.add(Integer.parseInt(number.trim()));

        }
        Solution solution = new Solution(); // Ensure there's a Solution class with canSortArray method
        boolean result = solution.canSortArray(nums.stream().mapToInt(i->i).toArray());
        System.out.println(result);
    }
}