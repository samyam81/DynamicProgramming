import java.util.HashMap;

public class fibo{ 
    public static void main(String[] args) {
        System.out.println(fiborev(2, new HashMap<>()));
        System.out.println(fiborev(7, new HashMap<>()));
        System.out.println(fiborev(13, new HashMap<>()));
        System.out.println(fiborev(50, new HashMap<>()));
    }

    private static long fiborev(int n, HashMap<Integer, Long> memo) {
        if (n <= 2) {
            return 1;
        }
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            long fib = fiborev(n - 1, memo) + fiborev(n - 2, memo);
            memo.put(n, fib);
            return fib;
        }
    }
}
