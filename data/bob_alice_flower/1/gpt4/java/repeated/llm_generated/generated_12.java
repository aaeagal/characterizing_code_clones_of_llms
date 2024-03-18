import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println(main.flowerCalculate(firstNumber, secondNumber));
        input.close();
        System.exit(0);
    }
   
    public long flowerCalculate(int first, int second) {
        int oddOfFirst = (first + 1) / 2;
        int oddOfSecond = (second + 1) / 2;
        int evenOfFirst = first / 2;
        int evenOfSecond = second / 2;
        long total = oddOfFirst * 1L * evenOfSecond + oddOfSecond * 1L * evenOfFirst;
        return total;
    }
}