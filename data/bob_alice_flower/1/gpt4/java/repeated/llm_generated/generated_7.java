import java.util.Scanner;

public class Main {

    public long calculation(int x, int y) {
        int oddX = (x + 1) / 2;
        int oddY = (y + 1) / 2;
        int evenX = x / 2;
        int evenY = y / 2;
        return (long)oddX * evenY + (long)oddY * evenX;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        
        long result = m.calculation(x, y);
        System.out.println(result);
        
        input.close();
        
        System.exit(0);   
    }
}