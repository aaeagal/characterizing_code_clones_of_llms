import java.util.Scanner;

class AlternateSolution {
    public long calculateFlowerGame(int num1, int num2) {
        int oddCountNum1 = (num1 + 1) / 2, oddCountNum2 = (num2 + 1) / 2;
        int evenCountNum1 = num1 / 2, evenCountNum2 = num2 / 2;
        return oddCountNum1 * 1L * evenCountNum2 + oddCountNum2 * 1L * evenCountNum1;
    }

    public static void main(String[] arguments) {
        AlternateSolution solution = new AlternateSolution();
        // read num1 and num2 from standard input
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(solution.calculateFlowerGame(num1, num2));
        scanner.close();
        // terminate program
        System.exit(0);
    }
}