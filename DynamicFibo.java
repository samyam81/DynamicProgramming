import java.util.HashMap;

public class DynamicFibo {
     public int fib(int n) {
        return Fibo(n, new HashMap<>());
    }

    private int Fibo(int n, HashMap<Integer, Integer> memo) {
        if (n == 0)
            return 0;
        if (n == 2 || n == 1)
            return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int fib = Fibo(n - 1, memo) + Fibo(n - 2, memo);
            memo.put(n, fib);
            return fib;
        }
    }
}
