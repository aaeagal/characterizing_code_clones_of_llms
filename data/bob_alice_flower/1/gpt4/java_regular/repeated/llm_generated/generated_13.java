import java.util.Scanner;
class SolutionClass {
    public long eaGame(int x, int y) {
        int countOddX = (x + 1) / 2, countOddY = (y + 1) / 2;
        int countEvenX = x / 2, countEvenY = y / 2;
        return countOddX * 1L * countEvenY + countOddY * 1L * countEvenX;
    }
    public static void main(String[] args) {
        SolutionClass sClass = new SolutionClass();
        // read x and y from stdin
        Scanner inputScanner = new Scanner(System.in);
        int x = inputScanner.nextInt();
        int y = inputScanner.nextInt();
        System.out.println(sClass.eaGame(x, y));
        inputScanner.close();
        // exit 
        System.exit(0);   
    }
}