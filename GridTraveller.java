import java.util.HashMap;

public class GridTraveller {
    public static void main(String[] args) {
        System.out.println(grid(2, 3,new HashMap<>()));
        System.out.println(grid(18, 18, new HashMap<>()));
    }

    private static long grid(int m, int n, HashMap<String, Long> hashMap) {
        String key = m + "+," + n;
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        }
        if (m == 1 && m == n)
            return 1;
        else if (m == 0 || n == 0)
            return 0;

        long ke = grid(m - 1, n, hashMap) + grid(m, n - 1, hashMap);
        hashMap.put(key, ke);
        return ke;
    }

    // private static int grid(int m, int n) {
    //     if (m == 1 && m == n)
    //         return 1;
    //     else if (m == 0 || n == 0)
    //         return 0;
    //     return grid(m - 1, n) + grid(m, n - 1);
    // }
    
}
