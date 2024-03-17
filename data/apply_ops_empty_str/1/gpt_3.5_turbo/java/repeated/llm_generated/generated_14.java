import java.util.Scanner;
class ModifiedSolution {
    public String getHighestFrequencyChar(String input) {
        int[] frequencyArr = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < input.length(); i++) {
            frequencyArr[input.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, frequencyArr[i]);
        }
        
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (frequencyArr[input.charAt(i) - 'a'] == maxFreq) {
                frequencyArr[input.charAt(i) - 'a'] --;
                result = input.charAt(i) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ModifiedSolution modifiedSol = new ModifiedSolution();
        
        Scanner scanner = new Scanner(System.in);
        
        String inputString = scanner.nextLine();
        
        System.out.println(modifiedSol.getHighestFrequencyChar(inputString));
        
        scanner.close();
        
        System.exit(0);
    }
}