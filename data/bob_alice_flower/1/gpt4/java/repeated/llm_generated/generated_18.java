import java.util.Scanner;

class FlowerGameExecutor {
    private long calculateScore(int value1, int value2) {
        int oddValue1 = (value1 + 1) >> 1;
        int oddValue2 = (value2 + 1) >> 1;
        int evenValue1 = value1 >> 1;
        int evenValue2 = value2 >> 1;
        return (long)oddValue1 * evenValue2 + (long)oddValue2 * evenValue1;
    }
    public static void main(String[] args) {
        FlowerGameExecutor executorInstance = new FlowerGameExecutor();
        Scanner inputScanner = new Scanner(System.in);
        int firstNumber = inputScanner.nextInt();
        int secondNumber = inputScanner.nextInt();
        System.out.println(executorInstance.calculateScore(firstNumber, secondNumber));
        inputScanner.close();
        System.exit(0);
    }
}