1.
```java
import java.util.Scanner;
class Solution1 {
    public String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int maximum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, frequency[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == maximum) {
                frequency[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.getLastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}
```

2.
```java
import java.util.Scanner;
class Solution2 {
    public String findLastNonEmptyString(String input) {
        int[] count = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }
        
        String output = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (count[input.charAt(i) - 'a'] == maxCount) {
                count[input.charAt(i) - 'a']--;
                output = input.charAt(i) + output;
            }
        }
        
        return output;
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}
```

3.
```java
import java.util.Scanner;
class Solution3 {
    public String computeLastNonEmptyString(String sequence) {
        int[] freq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < sequence.length(); i++) {
            freq[sequence.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        
        String answer = "";
        
        for (int i = sequence.length() - 1; i >= 0; i--) {
            if (freq[sequence.charAt(i) - 'a'] == maxFreq) {
                freq[sequence.charAt(i) - 'a']--;
                answer = sequence.charAt(i) + answer;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        System.out.println(solution.computeLastNonEmptyString(sequence));
        scanner.close();
        System.exit(0);
    }
}
```

4.
```java
import java.util.Scanner;
class Solution4 {
    public String determineLastNonEmptyString(String text) {
        int[] alphabetCount = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < text.length(); i++) {
            alphabetCount[text.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, alphabetCount[i]);
        }
        
        String resultString = "";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            if (alphabetCount[text.charAt(i) - 'a'] == maxCount) {
                alphabetCount[text.charAt(i) - 'a']--;
                resultString = text.charAt(i) + resultString;
            }
        }
        
        return resultString;
    }
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(solution.determineLastNonEmptyString(text));
        scanner.close();
        System.exit(0);
    }
}
```

5.
```java
import java.util.Scanner;
class Solution5 {
    public String calculateLastNonEmptyString(String line) {
        int[] charCount = new int[26];
        int maxCharCount = 0;
        
        for (int i = 0; i < line.length(); i++) {
            charCount[line.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCharCount = Math.max(maxCharCount, charCount[i]);
        }
        
        String finalString = "";
        
        for (int i = line.length() - 1; i >= 0; i--) {
            if (charCount[line.charAt(i) - 'a'] == maxCharCount) {
                charCount[line.charAt(i) - 'a']--;
                finalString = line.charAt(i) + finalString;
            }
        }
        
        return finalString;
    }
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(solution.calculateLastNonEmptyString(line));
        scanner.close();
        System.exit(0);
    }
}
```

6.
```java
import java.util.Scanner;
class Solution6 {
    public String extractLastNonEmptyString(String inputString) {
        int[] letterCount = new int[26];
        int maxLetterCount = 0;
        
        for (int i = 0; i < inputString.length(); i++) {
            letterCount[inputString.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxLetterCount = Math.max(maxLetterCount, letterCount[i]);
        }
        
        String outputString = "";
        
        for (int i = inputString.length() - 1; i >= 0; i--) {
            if (letterCount[inputString.charAt(i) - 'a'] == maxLetterCount) {
                letterCount[inputString.charAt(i) - 'a']--;
                outputString = inputString.charAt(i) + outputString;
            }
        }
        
        return outputString;
    }
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(solution.extractLastNonEmptyString(inputString));
        scanner.close();
        System.exit(0);
    }
}
```

7.
```java
import java.util.Scanner;
class Solution7 {
    public String retrieveLastNonEmptyString(String userInput) {
        int[] charFrequency = new int[26];
        int maxFrequency = 0;
        
        for (int i = 0; i < userInput.length(); i++) {
            charFrequency[userInput.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFrequency = Math.max(maxFrequency, charFrequency[i]);
        }
        
        String result = "";
        
        for (int i = userInput.length() - 1; i >= 0; i--) {
            if (charFrequency[userInput.charAt(i) - 'a'] == maxFrequency) {
                charFrequency[userInput.charAt(i) - 'a']--;
                result = userInput.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(solution.retrieveLastNonEmptyString(userInput));
        scanner.close();
        System.exit(0);
    }
}
```

8.
```java
import java.util.Scanner;
class Solution8 {
    public String getLastNonEmptySubstring(String inputStr) {
        int[] charFreq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < inputStr.length(); i++) {
            charFreq[inputStr.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, charFreq[i]);
        }
        
        String resultStr = "";
        
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            if (charFreq[inputStr.charAt(i) - 'a'] == maxFreq) {
                charFreq[inputStr.charAt(i) - 'a']--;
                resultStr = inputStr.charAt(i) + resultStr;
            }
        }
        
        return resultStr;
    }
    public static void main(String[] args) {
        Solution8 solution = new Solution8();
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        System.out.println(solution.getLastNonEmptySubstring(inputStr));
        scanner.close();
        System.exit(0);
    }
}
```

9.
```java
import java.util.Scanner;
class Solution9 {
    public String findLastNonEmptySubstring(String str) {
        int[] charCounts = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCounts[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (charCounts[str.charAt(i) - 'a'] == maxCount) {
                charCounts[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.findLastNonEmptySubstring(str));
        scanner.close();
        System.exit(0);
    }
}
```

10.
```java
import java.util.Scanner;
class Solution10 {
    public String getLastNonEmptySubsequence(String sequence) {
        int[] charFrequencies = new int[26];
        int maxFrequency = 0;
        
        for (int i = 0; i < sequence.length(); i++) {
            charFrequencies[sequence.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFrequency = Math.max(maxFrequency, charFrequencies[i]);
        }
        
        String resultSequence = "";
        
        for (int i = sequence.length() - 1; i >= 0; i--) {
            if (charFrequencies[sequence.charAt(i) - 'a'] == maxFrequency) {
                charFrequencies[sequence.charAt(i) - 'a']--;
                resultSequence = sequence.charAt(i) + resultSequence;
            }
        }
        
        return resultSequence;
    }
    public static void main(String[] args) {
        Solution10 solution = new Solution10();
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        System.out.println(solution.getLastNonEmptySubsequence(sequence));
        scanner.close();
        System.exit(0);
    }
}
```

11.
```java
import java.util.Scanner;
class Solution11 {
    public String findLastNonEmptySubsequence(String input) {
        int[] charCounts = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            charCounts[input.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCounts[i]);
        }
        
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (charCounts[input.charAt(i) - 'a'] == maxCount) {
                charCounts[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.findLastNonEmptySubsequence(input));
        scanner.close();
        System.exit(0);
    }
}
```

12.
```java
import java.util.Scanner;
class Solution12 {
    public String getLastNonEmptySubstr(String str) {
        int[] charFreq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < str.length(); i++) {
            charFreq[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, charFreq[i]);
        }
        
        String resultStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (charFreq[str.charAt(i) - 'a'] == maxFreq) {
                charFreq[str.charAt(i) - 'a']--;
                resultStr = str.charAt(i) + resultStr;
            }
        }
        
        return resultStr;
    }
    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.getLastNonEmptySubstr(str));
        scanner.close();
        System.exit(0);
    }
}
```

13.
```java
import java.util.Scanner;
class Solution13 {
    public String findLastNonEmptySubstr(String inputStr) {
        int[] charCounts = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < inputStr.length(); i++) {
            charCounts[inputStr.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCounts[i]);
        }
        
        String resultStr = "";
        
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            if (charCounts[inputStr.charAt(i) - 'a'] == maxCount) {
                charCounts[inputStr.charAt(i) - 'a']--;
                resultStr = inputStr.charAt(i) + resultStr;
            }
        }
        
        return resultStr;
    }
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        System.out.println(solution.findLastNonEmptySubstr(inputStr));
        scanner.close();
        System.exit(0);
    }
}
```

14.
```java
import java.util.Scanner;
class Solution14 {
    public String getLastNonEmptySubsequence(String sequence) {
        int[] charFrequencies = new int[26];
        int maxFrequency = 0;
        
        for (int i = 0; i < sequence.length(); i++) {
            charFrequencies[sequence.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFrequency = Math.max(maxFrequency, charFrequencies[i]);
        }
        
        String resultSequence = "";
        
        for (int i = sequence.length() - 1; i >= 0; i--) {
            if (charFrequencies[sequence.charAt(i) - 'a'] == maxFrequency) {
                charFrequencies[sequence.charAt(i) - 'a']--;
                resultSequence = sequence.charAt(i) + resultSequence;
            }
        }
        
        return resultSequence;
    }
    public static void main(String[] args) {
        Solution14 solution = new Solution14();
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        System.out.println(solution.getLastNonEmptySubsequence(sequence));
        scanner.close();
        System.exit(0);
    }
}
```

15.
```java
import java.util.Scanner;
class Solution15 {
    public String findLastNonEmptySubsequence(String input) {
        int[] charCounts = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            charCounts[input.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCounts[i]);
        }
        
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (charCounts[input.charAt(i) - 'a'] == maxCount) {
                charCounts[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution15 solution = new Solution15();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.findLastNonEmptySubsequence(input));
        scanner.close();
        System.exit(0);
    }
}
```

16.
```java
import java.util.Scanner;
class Solution16 {
    public String getLastNonEmptySubstr(String str) {
        int[] charFreq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < str.length(); i++) {
            charFreq[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, charFreq[i]);
        }
        
        String resultStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (charFreq[str.charAt(i) - 'a'] == maxFreq) {
                charFreq