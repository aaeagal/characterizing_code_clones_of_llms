import java.util.Scanner;
class Solver {
    public long botanicalPuzzle(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solver solve = new Solver();
        // read n and m from stdin
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(solve.botanicalPuzzle(n, m));
        scanner.close();
        // exit 
        System.exit(0);   
    }
}