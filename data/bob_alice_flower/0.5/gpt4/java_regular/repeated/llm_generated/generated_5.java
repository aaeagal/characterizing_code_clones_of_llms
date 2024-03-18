import java.util.Scanner;
class Main {
    public long petalGame(int a, int b) {
        int oddCountA = (a + 1) / 2, oddCountB = (b + 1) / 2;
        int evenCountA = a / 2, evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    public static void main(String[] args) {
        Main main = new Main();
        // read a and b from stdin
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(main.petalGame(a, b));
        scanner.close();
        // exit 
        System.exit(0);   
    }
}