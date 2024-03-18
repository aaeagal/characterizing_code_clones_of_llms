Here is a Java code clone of the provided code. Note that the two pieces of code are functionally identical but are written in slightly different ways to avoid an exact copy:

```java
import java.util.Scanner;

class FlowerGameCalculator {
    public long calculateFlowerGame(int a, int b) {
        int countOddA = (a + 1) / 2, countOddB = (b + 1) / 2;
        int countEvenA = a / 2, countEvenB = b / 2;
        return countOddA * 1L * countEvenB + countOddB * 1L * countEvenA;
    }

    public static void main(String[] args) {
        FlowerGameCalculator obj = new FlowerGameCalculator();
        Scanner userInput = new Scanner(System.in);
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        System.out.println(obj.calculateFlowerGame(a, b));
        userInput.close();
        System.exit(0);
    }
}
```

In the above code, 

- I have named the class `FlowerGameCalculator` instead of `Solution`.
- The method `flowerGame(int n, int m)` has been renamed to `calculateFlowerGame(int a, int b)`. 
- Variables `n` and `m` have been replaced with `a` and `b` respectively.
- Also the object `Scanner` has been changed from `scanner` to `userInput`. 
- Lastly, the `Solution` object `sol` has been renamed to `obj`. 

All of these changes are just cosmetic and don't alter the behaviour of the code.