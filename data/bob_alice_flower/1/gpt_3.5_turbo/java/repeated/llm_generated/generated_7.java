import java.util.Scanner;

class FlowerGameSolution {
    
    public long calculateFlowerGame(int n, int m) {
        int oddNumN = (n + 1) / 2, oddNumM = (m + 1) / 2;
        int evenNumN = n / 2, evenNumM = m / 2;
        return oddNumN * 1L * evenNumM + oddNumM * 1L * evenNumN;
    }
    
    public static void main(String[] arguments) {
        FlowerGameSolution solution = new FlowerGameSolution();
        
        // Getting input for n and m from the user
        Scanner scanner = new Scanner(System.in);
        int nValue = scanner.nextInt();
        int mValue = scanner.nextInt();
        System.out.println(solution.calculateFlowerGame(nValue, mValue));
        scanner.close();
        
        // Exiting the program
        System.exit(0);
    }
}