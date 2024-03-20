import java.util.*;
import java.io.*;
class Solution18 {
    public String lastNonEmptyString(String s) {
        int[] arr = new int[26];
        int max = 0;
        
