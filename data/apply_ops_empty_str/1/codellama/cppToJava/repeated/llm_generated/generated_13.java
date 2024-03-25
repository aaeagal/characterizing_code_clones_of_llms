 class SimpleClass {
          public ArrayList<Character> lastNonEmptyString(String s) {
              HashMap<Character, Integer> count = new HashMap<>();
              for (int i = 0; i < s.length(); i++) {
                  count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
              }
  
              List<Character> ans = new ArrayList<>();
  
              for (int i = 0; i < s.length(); i++) {
                  char c = s.charAt(i);
                  if (count.get(c) > 1) {
                      ans.add(c);
                  }
              }
              return ans; 
          }
    }

Explanation: -

This function takes a string s as an input and returns an ArrayList of all characters that repeat at least once in the string. The time complexity of this function is O(nlogn), where n
 is the length of the input string. 