import java.util.Scanner;

class Game {
    
    public static void main(String[] args) {
        Game game = new Game();
       
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println(game.calculateGame(a, b));
        
        input.close();
        
        System.exit(0);   
    }

    public long calculateGame(int a, int b) {
        int evenA = a / 2;
        int evenB = b / 2;
        int oddA = (a + 1) / 2;
        int oddB = (b + 1) / 2;
        
        return (oddA * 1L * evenB) + (oddB * 1L * evenA);
    }
}