import java.util.Scanner;

class Main {
    public long playFlowerGame(int a, int b) {
        int oddA = (a + 1) / 2, oddB = (b + 1) / 2;
        int evenA = a / 2, evenB = b / 2;
        return (long)oddA * evenB + (long)oddB * evenA;
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        // read a and b from stdin
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(main.playFlowerGame(a, b));
        scan.close();
        // exit 
        System.exit(0);   
    }
}