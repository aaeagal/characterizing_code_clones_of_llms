Here is a Java equivalent of the Python code provided:

import java.util.*;

public class Solution {
    public static int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers separated by space: ");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        System.out.println(flowerGame(n, m));
        System.exit(0);
    }
} 

The user would need to manually input the two integers separately by a space while running the Java program. Please ensure to input both numbers when asked on execution.