Here are 20 separate Java semantic code clones of the provided code:

1.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

2.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

3.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

4.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

5.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

6.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

7.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

8.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

9.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

10.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

11.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

12.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

13.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

14.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}
```

15.
```java
import java.util.Scanner;
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
        // read string from stdin
        Scanner scanner