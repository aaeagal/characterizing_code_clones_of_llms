import java.util.Scanner;
class FlowerGame {
    public long performGame(long a, long b) {
        long evenA = a/2;
        long oddA = (a+1)/2;
        long evenB = b/2;
        long oddB = (b+1)/2;
        
        return evenA * oddB + evenB * oddA;
    }
    public static void main(String[] parms) {
        FlowerGame game = new FlowerGame();
        Scanner inputReader = new Scanner(System.in);
        long a = inputReader.nextLong();
        long b = inputReader.nextLong();
        System.out.println(game.performGame(a, b));
        inputReader.close();
        System.exit(0);   
    }
}