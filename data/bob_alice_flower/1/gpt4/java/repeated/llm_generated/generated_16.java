import java.util.Scanner;
public class Main {
    public long playFlowerGame(int parameter1, int parameter2) {
        int oddCountParameter1 = (parameter1 % 2 == 0) ? parameter1 / 2 : parameter1 / 2 + 1;
        int oddCountParameter2 = (parameter2 % 2 == 0) ? parameter2 / 2 : parameter2 / 2 + 1;
        int evenCountParameter1 = parameter1 / 2;
        int evenCountParameter2 = parameter2 / 2;
        return (long) oddCountParameter1 * evenCountParameter2 + (long) oddCountParameter2 * evenCountParameter1;
    }

    public static void main(String[] arguments) {
        Main mainObject = new Main();
        // read parameter1 and parameter2 from stdin
        Scanner inputScanner = new Scanner(System.in);
        int parameter1 = inputScanner.nextInt();
        int parameter2 = inputScanner.nextInt();
        System.out.println(mainObject.playFlowerGame(parameter1, parameter2));
        inputScanner.close();
        // exit 
        System.exit(0);   
    }
}