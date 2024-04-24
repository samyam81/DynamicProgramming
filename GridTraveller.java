import java.util.HashMap;

public class GridTraveller {
    public static void main(String[] args) {
        // Example usage of the grid method
        int m = 6;
        int n = 6;
        HashMap<Triplet<Integer, Integer, Long>, Long> memoization = new HashMap<>();
        long result = grid(m, n, memoization);
        System.out.println("Result: " + result);
    }

    public static class Triplet<K, V, L> {
        private K key;
        private V value1;
        private L value2;

        public Triplet(K key, V value1, L value2) {
            this.key = key;
            this.value1 = value1;
            this.value2 = value2;
        }

        public K getKey() {
            return key;
        }

        public V getValue1() {
            return value1;
        }

        public L getValue2() {
            return value2;
        }
    }

    private static long grid(int m, int n, HashMap<Triplet<Integer, Integer, Long>, Long> memoization) {
        Triplet<Integer, Integer, Long> key = new Triplet<>(m, n, 0L);
        if (memoization.containsKey(key)) {
            return memoization.get(key);
        }
        if (m == 1 && m == n)
            return 1;
        else if (m == 0 || n == 0)
            return 0;

        long Samyam = grid(m - 1, n, memoization) + grid(m, n - 1, memoization);
        memoization.put(key, Samyam);
        return Samyam;
    }
}
