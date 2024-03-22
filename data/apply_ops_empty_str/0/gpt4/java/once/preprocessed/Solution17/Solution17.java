import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution17 {
    public String lastNonEmptyString(String userLineString) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userLineString.length(); i++) {
            arr[userLineString.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++)