import java.util.Scanner;

class FlowerGameClone {
    public long computeFlowerGame(int p, int q) {
        int countedOddP = (p + 1) / 2, countedOddQ = (q + 1) / 2;
        int countedEvenP = p / 2, countedEvenQ = q / 2;
        return countedOddP * 1L * countedEvenQ + countedOddQ * 1L * countedEvenP;
    }
    
    public static void main(String[] args) {
        FlowerGameClone clone = new FlowerGameClone();
        // read p and q from stdin
        Scanner inputScanner = new Scanner(System.in);
        int p = inputScanner.nextInt();
        int q = inputScanner.nextInt();
        System.out.println(clone.computeFlowerGame(p, q));
        inputScanner.close();
        // exit 
        System.exit(0);
    }
}