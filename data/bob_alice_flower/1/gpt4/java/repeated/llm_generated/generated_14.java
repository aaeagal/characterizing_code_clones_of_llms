import java.util.Scanner;

public class FlowerGameSolution {
    public long calculateFlowerGame(int input1, int input2) {
        int halfPlusOneInput1 = (input1 + 1) / 2, halfPlusOneInput2 = (input2 + 1) / 2;
        int halfInput1 = input1 / 2, halfInput2 = input2 / 2;
        return (long)halfPlusOneInput1 * halfInput2 + (long) halfPlusOneInput2 * halfInput1;
    }

    public static void main(String[] parameters) {
        FlowerGameSolution fgs = new FlowerGameSolution();
        // read input1 and input2 from stdin
        Scanner readInput = new Scanner(System.in);
        int input1 = readInput.nextInt();
        int input2 = readInput.nextInt();
        System.out.println(fgs.calculateFlowerGame(input1, input2));
        readInput.close();
        // terminate the program 
        System.exit(0);
    }
}