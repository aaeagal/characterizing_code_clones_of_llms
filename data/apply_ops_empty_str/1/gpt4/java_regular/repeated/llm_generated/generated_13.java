import java.util.Scanner;

class CloneSolution {
    public String getLastNonEmptySequence(String input) {
        int array[] = new int[26];
        int highest = 0;
        
        for (int index = 0; index < input.length(); index++) {
            array[input.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            highest = Math.max(highest, array[index]);
        }
        
        String finalString = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (array[input.charAt(index) - 'a'] == highest) {
                array[input.charAt(index) - 'a']--;
                finalString = input.charAt(index) + finalString;
            }
        }
        
        return finalString;
    }

    public static void main(String[] args) {
        CloneSolution solution = new CloneSolution();
        
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        System.out.println(solution.getLastNonEmptySequence(inputString));
        
        scanner.close();
    
        System.exit(0);
    }
}