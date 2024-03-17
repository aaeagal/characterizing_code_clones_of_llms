1. import java.util.Scanner;
class Solution {
    public String getLastNonEmptyString(String input) {
        int[] letterCount = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            letterCount[input.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, letterCount[i]);
        }
        
        
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (letterCount[input.charAt(i) - 'a'] == maxCount) {
                letterCount[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in); 
        String input = scanner.nextLine();
        System.out.println(solution.getLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}

2. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String str) {
        int[] charCount = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < str.length(); index++) {
            charCount[str.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, charCount[index]);
        }
        
        String result = "";
        
        for (int index = str.length() - 1; index >= 0; index--) {
            if (charCount[str.charAt(index) - 'a'] == maxCount) {
                charCount[str.charAt(index) - 'a']--;
                result = str.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}

3. import java.util.Scanner;
class Solution {
    public String retrieveLastNonEmptyString(String inputString) {
        int[] characterCounts = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < inputString.length(); index++) {
            characterCounts[inputString.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, characterCounts[index]);
        }
        
        String result = "";
        
        for (int index = inputString.length() - 1; index >= 0; index--) {
            if (characterCounts[inputString.charAt(index) - 'a'] == maxCount) {
                characterCounts[inputString.charAt(index) - 'a']--;
                result = inputString.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in); 
        String inputString = scanner.nextLine();
        System.out.println(solution.retrieveLastNonEmptyString(inputString));
        scanner.close();
        System.exit(0);
    }
}

4. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String input) {
        int[] charCount = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < input.length(); index++) {
            charCount[input.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, charCount[index]);
        }
        
        String result = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (charCount[input.charAt(index) - 'a'] == maxCount) {
                charCount[input.charAt(index) - 'a']--;
                result = input.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}

5. import java.util.Scanner;
class Solution{
    public String getLastNonEmptyString(String input){
        int letterArray[] = new int[26];
        int max = 0;
       
        for (int i = 0; i < input.length(); i++){
            letterArray[input.charAt(i) - 'a']++;
        }
       
        for (int i = 0; i < 26; i++){
            max = Math.max(max, letterArray[i]);
        }
       
        String result = "";
       
        for (int i = input.length() - 1; i >= 0; i--){
            if (letterArray[input.charAt(i) - 'a'] == max){
                letterArray[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }
       
        return result;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}

6. import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a'] --;
                ans = s.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}

7. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, count[i]);
        }
        
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count[s.charAt(i) - 'a'] == max) {
                count[s.charAt(i) - 'a'] --;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}

8. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String str) {
        int[] charCount = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < str.length(); index++) {
            charCount[str.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, charCount[index]);
        }
        
        String result = "";
        
        for (int index = str.length() - 1; index >= 0; index--) {
            if (charCount[str.charAt(index) - 'a'] == maxCount) {
                charCount[str.charAt(index) - 'a']--;
                result = str.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.findLastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}

9. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String input) {
        int[] charCount = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < input.length(); index++) {
            charCount[input.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, charCount[index]);
        }
        
        String result = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (charCount[input.charAt(index) - 'a'] == maxCount) {
                charCount[input.charAt(index) - 'a']--;
                result = input.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}

10. import java.util.Scanner;
class Solution{
    public String getLastNonEmptyString(String input){
        int letterArray[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < input.length(); i++){
            letterArray[input.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++){
            max = Math.max(max, letterArray[i]);
        }
        
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--){
            if (letterArray[input.charAt(i) - 'a'] == max){
                letterArray[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}

11. import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a'] --;
                ans = s.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}

12. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, count[i]);
        }
        
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count[s.charAt(i) - 'a'] == max) {
                count[s.charAt(i) - 'a'] --;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}

13. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, count[i]);
        }
        
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count[s.charAt(i) - 'a'] == max) {
                count[s.charAt(i) - 'a'] --;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}

14. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, count[i]);
        }
        
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count[s.charAt(i) - 'a'] == max) {
                count[s.charAt(i) - 'a'] --;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}

15. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, count[i]);
        }
        
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count[s.charAt(i) - 'a'] == max) {
                count[s.charAt(i) - 'a']--;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}

16. import java.util.Scanner;
class Solution {
    public String getLastNonEmptyString(String s) {
        int[] arr = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a'] --;
                ans = s.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}

17. import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, count[i]);
        }
        
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count[s.charAt(i) - 'a'] == max) {
                count[s.charAt(i) - 'a'] --;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner =