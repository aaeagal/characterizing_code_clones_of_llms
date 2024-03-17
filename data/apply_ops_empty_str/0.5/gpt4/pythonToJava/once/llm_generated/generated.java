1. Java Code Clone 1:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> highestMap = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                highestMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestMap.containsKey(c)) {
                if (highestMap.get(c) == 1) {
                    ans.append(c);
                }
                highestMap.put(c, highestMap.get(c) - 1);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
2. Java Code Clone 2:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highestCount = sortedList.get(0).getValue();
        Map<Character, Integer> highestCountMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedList) {
            if (entry.getValue() == highestCount) {
                highestCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestCountMap.containsKey(c)) {
                if (highestCountMap.get(c) == 1) {
                    result.append(c);
                }
                highestCountMap.put(c, highestCountMap.get(c) - 1);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
3. Java Code Clone 3:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> frequencyList = new ArrayList<>(frequencyMap.entrySet());
        frequencyList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highestFrequency = frequencyList.get(0).getValue();
        Map<Character, Integer> highestFrequencyMap = new HashMap<>();
        StringBuilder resultString = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : frequencyList) {
            if (entry.getValue() == highestFrequency) {
                highestFrequencyMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestFrequencyMap.containsKey(c)) {
                if (highestFrequencyMap.get(c) == 1) {
                    resultString.append(c);
                }
                highestFrequencyMap.put(c, highestFrequencyMap.get(c) - 1);
            }
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
4. Java Code Clone 4:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charCount.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedEntries.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder finalString = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if (entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxCountMap.containsKey(c)) {
                if (maxCountMap.get(c) == 1) {
                    finalString.append(c);
                }
                maxCountMap.put(c, maxCountMap.get(c) - 1);
            }
        }

        return finalString.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
5. Java Code Clone 5:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charFreq.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxFreq = sortedEntries.get(0).getValue();
        Map<Character, Integer> maxFreqMap = new HashMap<>();
        StringBuilder resultStr = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if (entry.getValue() == maxFreq) {
                maxFreqMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxFreqMap.containsKey(c)) {
                if (maxFreqMap.get(c) == 1) {
                    resultStr.append(c);
                }
                maxFreqMap.put(c, maxFreqMap.get(c) - 1);
            }
        }

        return resultStr.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
6. Java Code Clone 6:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charCounter = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCounter.put(c, charCounter.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charCounter.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedEntries.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder resultString = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if (entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxCountMap.containsKey(c)) {
                if (maxCountMap.get(c) == 1) {
                    resultString.append(c);
                }
                maxCountMap.put(c, maxCountMap.get(c) - 1);
            }
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
7. Java Code Clone 7:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(charMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedList.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder resultStr = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedList) {
            if (entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxCountMap.containsKey(c)) {
                if (maxCountMap.get(c) == 1) {
                    resultStr.append(c);
                }
                maxCountMap.put(c, maxCountMap.get(c) - 1);
            }
        }

        return resultStr.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
8. Java Code Clone 8:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedList.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder resultStr = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedList) {
            if (entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxCountMap.containsKey(c)) {
                if (maxCountMap.get(c) == 1) {
                    resultStr.append(c);
                }
                maxCountMap.put(c, maxCountMap.get(c) - 1);
            }
        }

        return resultStr.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
9. Java Code Clone 9:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(frequencyMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxFrequency = sortedList.get(0).getValue();
        Map<Character, Integer> maxFrequencyMap = new HashMap<>();
        StringBuilder resultString = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedList) {
            if (entry.getValue() == maxFrequency) {
                maxFrequencyMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxFrequencyMap.containsKey(c)) {
                if (maxFrequencyMap.get(c) == 1) {
                    resultString.append(c);
                }
                maxFrequencyMap.put(c, maxFrequencyMap.get(c) - 1);
            }
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
10. Java Code Clone 10:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charCount.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedEntries.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder finalString = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if (entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxCountMap.containsKey(c)) {
                if (maxCountMap.get(c) == 1) {
                    finalString.append(c);
                }
                maxCountMap.put(c, maxCountMap.get(c) - 1);
            }
        }

        return finalString.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
11. Java Code Clone 11:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charFreq.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxFreq = sortedEntries.get(0).getValue();
        Map<Character, Integer> maxFreqMap = new HashMap<>();
        StringBuilder resultStr = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if (entry.getValue() == maxFreq) {
                maxFreqMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxFreqMap.containsKey(c)) {
                if (maxFreqMap.get(c) == 1) {
                    resultStr.append(c);
                }
                maxFreqMap.put(c, maxFreqMap.get(c) - 1);
            }
        }

        return resultStr.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
12. Java Code Clone 12:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charCounter = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCounter.put(c, charCounter.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charCounter.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedEntries.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder resultString = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if (entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxCountMap.containsKey(c)) {
                if (maxCountMap.get(c) == 1) {
                    resultString.append(c);
                }
                maxCountMap.put(c, maxCountMap.get(c) - 1);
            }
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
13. Java Code Clone 13:
```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(charMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedList.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder resultStr = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedList) {
            if (entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxCountMap