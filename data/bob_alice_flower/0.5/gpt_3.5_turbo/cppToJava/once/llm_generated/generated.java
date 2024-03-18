1. 

```java
import java.util.Scanner;

class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n, m;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] input = line.split(" ");
            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);

            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

2. 

```java
import java.util.Scanner;

class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n, m;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] input = line.split(" ");
            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);

            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

3. 

```java
import java.util.Scanner;

class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n, m;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] input = line.split(" ");
            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);

            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```