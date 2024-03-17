import java.util.Scanner;

class MySolution {
    public String getLastNonEmptyString(String input) {
        int frequency[] = new int[26];
        int maxFrequency = 0;
        
        for (int index = 0; index < input.length(); index++) {
            frequency[input.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxFrequency = Math.max(maxFrequency, frequency[index]);
        }
        
        
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (frequency[input.charAt(i) - 'a'] == maxFrequency) {
                frequency[input.charAt(i) - 'a'] --;
                result = input.charAt(i) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        MySolution mySol = new MySolution();
        // read string from stdin
        Scanner scan = new Scanner(System.in);
        // read only one line from stdin
        String input = scan.nextLine();
        // call the function and print the result
        System.out.println(mySol.getLastNonEmptyString(input));
        scan.close();
        // end the program
        System.exit(0);
    }
}