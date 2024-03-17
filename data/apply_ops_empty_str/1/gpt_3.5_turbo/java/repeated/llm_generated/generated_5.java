import java.util.Scanner;

class DifferentSolution {
    public String firstNonEmptyString(String str) {
        int array[] = new int[26];
        int minimum = Integer.MAX_VALUE;
        
        for (int j = 0; j < str.length(); j++) {
            array[str.charAt(j) - 'a'] ++;
        }
        
        for (int k = 0; k < 26; k++) {
            minimum = Math.min(minimum, array[k]);
        }
        
        String result = "";
        
        for (int p = 0; p < str.length(); p++) {
            if (array[str.charAt(p) - 'a'] == minimum) {
                array[str.charAt(p) - 'a'] ++;
                result = result + str.charAt(p);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        DifferentSolution differentSol = new DifferentSolution();
        
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        
        System.out.println(differentSol.firstNonEmptyString(str));
        
        scanner.close();
        
        System.exit(0);
    }
}