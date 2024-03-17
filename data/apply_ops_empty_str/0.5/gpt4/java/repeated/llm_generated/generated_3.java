import java.util.Scanner;

class Main {
    public String getLastNonEmptyString(String str) {
        int frequency[] = new int[26];
        int highest = 0;
        
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            highest = Math.max(highest, frequency[i]);
        }
        
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == highest) {
                frequency[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(main.getLastNonEmptyString(str));
        input.close();
        System.exit(0);
    }
}