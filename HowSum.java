import java.util.Arrays;

public class HowSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(how(7, new int[] { 2, 3 })));
        System.out.println(Arrays.toString(how(300, new int[] { 7, 14 })));
    }

    private static int[] how(int targetSum, int[] numbers) {
        if (targetSum == 0) {
            return new int[0];
        }
        if (targetSum < 0) {
            return null;
        }
        for (int num : numbers) {
            int remainder = targetSum - num;
            int[] remainderResult = how(remainder, numbers);
            if (remainderResult != null) {
                int[] result = new int[remainderResult.length + 1];
                result[0] = num;
                System.arraycopy(remainderResult, 0, result, 1, remainderResult.length);
                return result;
            }
        }
        return null;
    }
}
