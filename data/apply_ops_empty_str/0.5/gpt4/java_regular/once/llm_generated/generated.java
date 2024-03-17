1. Solution1
```java
import java.util.Scanner;
class Solution1 {
    public String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int maxFreq = 0;

        for (int index = 0; index < str.length(); index++) {
            frequency[str.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maxFreq = Math.max(maxFreq, frequency[index]);
        }

        String result = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            if (frequency[str.charAt(index) - 'a'] == maxFreq) {
                frequency[str.charAt(index) - 'a']--;
                result = str.charAt(index) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(solution.getLastNonEmptyString(str));
        input.close();
        System.exit(0);
    }
}
```
2. Solution2
```java
import java.util.Scanner;
class Solution2 {
    public String findLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int maximum = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, arr[i]);
        }

        String answer = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == maximum) {
                arr[s.charAt(i) - 'a']--;
                answer = s.charAt(i) + answer;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        sc.close();
        System.exit(0);
    }
}
```
3. Solution3
```java
import java.util.Scanner;
class Solution3 {
    public String getFinalNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getFinalNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
4. Solution4
```java
import java.util.Scanner;
class Solution4 {
    public String findLastNonEmptyStr(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyStr(s));
        scanner.close();
        System.exit(0);
    }
}
```
5. Solution5
```java
import java.util.Scanner;
class Solution5 {
    public String getLastString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastString(s));
        scanner.close();
        System.exit(0);
    }
}
```
6. Solution6
```java
import java.util.Scanner;
class Solution6 {
    public String getLastNonEmptyStr(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyStr(s));
        scanner.close();
        System.exit(0);
    }
}
```
7. Solution7
```java
import java.util.Scanner;
class Solution7 {
    public String findLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
8. Solution8
```java
import java.util.Scanner;
class Solution8 {
    public String getLastNonEmptyStr(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyStr(s));
        scanner.close();
        System.exit(0);
    }
}
```
9. Solution9
```java
import java.util.Scanner;
class Solution9 {
    public String findLastNonEmptyStr(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyStr(s));
        scanner.close();
        System.exit(0);
    }
}
```
10. Solution10
```java
import java.util.Scanner;
class Solution10 {
    public String findLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
11. Solution11
```java
import java.util.Scanner;
class Solution11 {
    public String getLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
12. Solution12
```java
import java.util.Scanner;
class Solution12 {
    public String getLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
13. Solution13
```java
import java.util.Scanner;
class Solution13 {
    public String getLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
14. Solution14
```java
import java.util.Scanner;
class Solution14 {
    public String getLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
15. Solution15
```java
import java.util.Scanner;
class Solution15 {
    public String getLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
16. Solution16
```java
import java.util.Scanner;
class Solution16 {
    public String getLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
17. Solution17
```java
import java.util.Scanner;
class Solution17 {
    public String getLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public