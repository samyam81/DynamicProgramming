public class GridTraveller {
    public static void main(String[] args) {
        System.out.println(grid(2, 3));
        System.out.println(grid(18, 18));
    }

    private static int grid(int m, int n) {
        if (m == 1 && m == n)
            return 1;
        else if (m == 0 || n == 0)
            return 0;
        return grid(m - 1, n) + grid(m, n - 1);
    }
}
