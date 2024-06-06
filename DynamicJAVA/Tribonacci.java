import java.util.HashMap;

public class Tribonacci {
    public static void main(String[] args) {
        System.out.println(tribo(6, new HashMap<>()));
        System.out.println(tribo(40, new HashMap<>()));
    }

    private static long tribo(int n, HashMap<Integer, Long> hashMap) {
        if (n == 1 || n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }
        if (hashMap.containsKey(n)) {
            return hashMap.get(n);
        } else {
            long tribo = tribo(n - 1, hashMap) + tribo(n - 2, hashMap) + tribo(n - 3, hashMap);
            hashMap.put(n, tribo);
            return tribo;
        }
    }
}
