import java.util.Scanner;

class DifferentSolution {
    public long calculate(int x, int y) {
        int oddX = (x + 1) / 2, oddY = (y + 1) / 2;
        int evenX = x / 2, evenY = y / 2;
        return oddX * 1L * evenY + oddY * 1L * evenX;
    }

    public static void main(String[] arguments) {
        DifferentSolution differentSol = new DifferentSolution();
        // input values for x and y from the standard input
        Scanner scanner2 = new Scanner(System.in);
        int x = scanner2.nextInt();
        int y = scanner2.nextInt();
        System.out.println(differentSol.calculate(x, y));
        scanner2.close();
        // exit program
        System.exit(0);   
    }
}