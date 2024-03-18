import java.util.Scanner;
class Main {
    public long runFlowerGame(int totalNum, int chosenNum) {
        int oddTotal = (totalNum + 1) / 2, oddChosen = (chosenNum + 1) / 2;
        int evenTotal = totalNum / 2, evenChosen = chosenNum / 2;
        return (long) oddTotal * evenChosen + (long) oddChosen * evenTotal;
    }
    public static void main(String[] args) {
        Main mainCls = new Main();
        
        Scanner inputScanner = new Scanner(System.in);
        int totalNum = inputScanner.nextInt();
        int chosenNum = inputScanner.nextInt();
        System.out.println(mainCls.runFlowerGame(totalNum, chosenNum));
        inputScanner.close();
        
        System.exit(0);   
    }
}