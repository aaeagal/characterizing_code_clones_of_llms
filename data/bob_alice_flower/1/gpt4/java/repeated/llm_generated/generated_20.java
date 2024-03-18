import java.util.Scanner;

public class Main {
    private long calculateFlowerGame(int n, int m) {
        int countOddN = (n + 1) / 2;
        int countOddM = (m + 1) / 2;
        int countEvenN = n / 2;
        int countEvenM = m / 2;
        return (long) countOddN * countEvenM + (long) countOddM * countEvenN;
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        // read values of n and m from standard input
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();
        int m = inputScanner.nextInt();
        System.out.println(mainObj.calculateFlowerGame(n, m));
        inputScanner.close();
        // terminate the program 
        System.exit(0);   
    }
}