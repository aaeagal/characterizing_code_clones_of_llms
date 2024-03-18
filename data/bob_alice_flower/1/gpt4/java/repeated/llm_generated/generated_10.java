import java.util.Scanner;

class Main {
    public long gameOfFlowers(int x, int y) {
        int countOddX = (x + 1) / 2, countOddY = (y + 1) / 2;
        int countEvenX = x / 2, countEvenY = y / 2;
        return countOddX * 1L * countEvenY + countOddY * 1L * countEvenX;
    }
    
    public static void main(String[] args) {
        Main mainObj = new Main();
        // read x and y from stdin
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(mainObj.gameOfFlowers(x, y));
        input.close();
        // terminate program
        exit(0);
    }
}