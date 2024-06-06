import java.util.HashMap;

public class DynamicTribo {
     public int tribonacci(int n) {
        return (int)tribo(n, new HashMap<>());
    }
     private static long tribo(int n, HashMap<Integer, Long> hashMap) {
        if (n == 1 || n == 2) return 1;
        if (n == 0) return 0;
        if (hashMap.containsKey(n)) {
            return hashMap.get(n);
        } else {
            long tribo = tribo(n - 1, hashMap) + tribo(n - 2, hashMap) + tribo(n - 3, hashMap);
            hashMap.put(n, tribo);
            return tribo;
        }
    }
}
