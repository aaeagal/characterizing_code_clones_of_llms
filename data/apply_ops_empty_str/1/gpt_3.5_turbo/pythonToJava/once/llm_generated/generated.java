1. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new LinkedHashMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(new TreeMap<>(d).entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new LinkedHashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

2. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new HashMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(new TreeMap<>(d).entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

3. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new Hashtable<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(new TreeMap<>(d).entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new Hashtable<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

4. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new TreeMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(new TreeMap<>(d).entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new TreeMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

5. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new LinkedHashMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new LinkedHashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

6. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new HashMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

7. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new Hashtable<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new Hashtable<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

8. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new TreeMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new TreeMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

9. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new LinkedHashMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new LinkedHashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

10. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new HashMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(new TreeMap<>(d).entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

11. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new Hashtable<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(new TreeMap<>(d).entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new Hashtable<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

12. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new TreeMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(new TreeMap<>(d).entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new TreeMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

13. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new LinkedHashMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new LinkedHashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

14. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new HashMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

15. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new Hashtable<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new Hashtable<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

16. 
```java
import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new TreeMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get