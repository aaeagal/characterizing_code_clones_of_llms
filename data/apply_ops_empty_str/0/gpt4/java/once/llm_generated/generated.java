1.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String str) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (arr[str.charAt(i) - 'a'] == max) {
                arr[str.charAt(i) - 'a'] --;
                ans = str.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}
```

2.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String input) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (arr[input.charAt(i) - 'a'] == max) {
                arr[input.charAt(i) - 'a'] --;
                ans = input.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}
```

3.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String text) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            if (arr[text.charAt(i) - 'a'] == max) {
                arr[text.charAt(i) - 'a'] --;
                ans = text.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(text));
        scanner.close();
        System.exit(0);
    }
}
```

4.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String line) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < line.length(); i++) {
            arr[line.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = line.length() - 1; i >= 0; i--) {
            if (arr[line.charAt(i) - 'a'] == max) {
                arr[line.charAt(i) - 'a'] --;
                ans = line.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(line));
        scanner.close();
        System.exit(0);
    }
}
```

5.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String sentence) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (arr[sentence.charAt(i) - 'a'] == max) {
                arr[sentence.charAt(i) - 'a'] --;
                ans = sentence.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(sentence));
        scanner.close();
        System.exit(0);
    }
}
```

6.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String word) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = word.length() - 1; i >= 0; i--) {
            if (arr[word.charAt(i) - 'a'] == max) {
                arr[word.charAt(i) - 'a'] --;
                ans = word.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(word));
        scanner.close();
        System.exit(0);
    }
}
```

7.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String phrase) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < phrase.length(); i++) {
            arr[phrase.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = phrase.length() - 1; i >= 0; i--) {
            if (arr[phrase.charAt(i) - 'a'] == max) {
                arr[phrase.charAt(i) - 'a'] --;
                ans = phrase.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(phrase));
        scanner.close();
        System.exit(0);
    }
}
```

8.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String inputString) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < inputString.length(); i++) {
            arr[inputString.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = inputString.length() - 1; i >= 0; i--) {
            if (arr[inputString.charAt(i) - 'a'] == max) {
                arr[inputString.charAt(i) - 'a'] --;
                ans = inputString.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(inputString));
        scanner.close();
        System.exit(0);
    }
}
```

9.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String userInput) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userInput.length(); i++) {
            arr[userInput.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userInput.length() - 1; i >= 0; i--) {
            if (arr[userInput.charAt(i) - 'a'] == max) {
                arr[userInput.charAt(i) - 'a'] --;
                ans = userInput.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userInput));
        scanner.close();
        System.exit(0);
    }
}
```

10.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String userText) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userText.length(); i++) {
            arr[userText.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userText.length() - 1; i >= 0; i--) {
            if (arr[userText.charAt(i) - 'a'] == max) {
                arr[userText.charAt(i) - 'a'] --;
                ans = userText.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userText));
        scanner.close();
        System.exit(0);
    }
}
```

11.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String userLine) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userLine.length(); i++) {
            arr[userLine.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userLine.length() - 1; i >= 0; i--) {
            if (arr[userLine.charAt(i) - 'a'] == max) {
                arr[userLine.charAt(i) - 'a'] --;
                ans = userLine.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String userLine = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userLine));
        scanner.close();
        System.exit(0);
    }
}
```

12.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String userSentence) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userSentence.length(); i++) {
            arr[userSentence.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userSentence.length() - 1; i >= 0; i--) {
            if (arr[userSentence.charAt(i) - 'a'] == max) {
                arr[userSentence.charAt(i) - 'a'] --;
                ans = userSentence.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String userSentence = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userSentence));
        scanner.close();
        System.exit(0);
    }
}
```

13.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String userWord) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userWord.length(); i++) {
            arr[userWord.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userWord.length() - 1; i >= 0; i--) {
            if (arr[userWord.charAt(i) - 'a'] == max) {
                arr[userWord.charAt(i) - 'a'] --;
                ans = userWord.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userWord));
        scanner.close();
        System.exit(0);
    }
}
```

14.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String userPhrase) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userPhrase.length(); i++) {
            arr[userPhrase.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userPhrase.length() - 1; i >= 0; i--) {
            if (arr[userPhrase.charAt(i) - 'a'] == max) {
                arr[userPhrase.charAt(i) - 'a'] --;
                ans = userPhrase.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String userPhrase = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userPhrase));
        scanner.close();
        System.exit(0);
    }
}
```

15.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String userInputString) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userInputString.length(); i++) {
            arr[userInputString.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userInputString.length() - 1; i >= 0; i--) {
            if (arr[userInputString.charAt(i) - 'a'] == max) {
                arr[userInputString.charAt(i) - 'a'] --;
                ans = userInputString.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String userInputString = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userInputString));
        scanner.close();
        System.exit(0);
    }
}
```

16.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String userTextString) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userTextString.length(); i++) {
            arr[userTextString.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userTextString.length() - 1; i >= 0; i--) {
            if (arr[userTextString.charAt(i) - 'a'] == max) {
                arr[userTextString.charAt(i) - 'a'] --;
                ans = userTextString.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String userTextString = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userTextString));
        scanner.close();
        System.exit(0);
    }
}
```

17.
```java
import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String userLineString) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userLineString.length(); i++) {
            arr[userLineString.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++)