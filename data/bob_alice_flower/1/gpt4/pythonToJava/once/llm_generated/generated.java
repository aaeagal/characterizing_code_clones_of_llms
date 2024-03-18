Given code is written in Python, not Java. So, the Java clones of Python code are provided below:

1.
```java
class Resolution {
    int blooming(int x, int y) {
        return x * y / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Resolution s = new Resolution();
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println(s.blooming(x, y));
    }
}
```

2.
```java
class Resolve {
    int blossom(int a, int b) {
        return a * b / 2;
    }
}

public class RunApp {
    public static void main(String[] args) {
        Resolve r = new Resolve();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(r.blossom(a, b));
    }
}
```

3.
```java
public class Application {
    int bloom(int a1, int a2) { 
        return a1 * a2 / 2;
    }
    
    public static void main(String[] ar) {
        Application app = new Application();
        int a1 = Integer.parseInt(ar[0]);
        int a2 = Integer.parseInt(ar[1]);
        System.out.println(app.bloom(a1, a2));
    }
}
```

4.
```java
class Compute {
    int flower(int a, int b) { 
        return a * b / 2; 
    }
}

public class Runner {
    public static void main(String[] args) {
        Compute c = new Compute();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(c.flower(a, b));
    }
}
```

5.
```java
class Action {
    int flowerPower(int i, int j) {
        return i * j / 2;
    }
}

public class Starter {
    public static void main(String[] args) {
        Action act = new Action();
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        System.out.println(act.flowerPower(i, j));
    }
}
```

Please note, the above Java solutions expect two command-line arguments (just like Python version expects two inputs from standard input). Java does not support standard input by the `input()` function like Python. However, you can still read from the standard input using a `Scanner` object. Also note that above examples do not perform any validation on the input data. If this is a requirement, then necessary checks should be added.