import java.util.Arrays;
import java.util.HashMap;

public class HowSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(how(7, new int[] { 2, 3 },new HashMap<>())));
        System.out.println(Arrays.toString(how(300, new int[] { 7, 14 },new HashMap<>())));
    }

    private static int[] how(int targetSum, int[] numbers, HashMap<Integer, int[]> hashMap) {
        if (targetSum == 0) {
            return new int[0];
        }
        if (targetSum < 0) {
            return null;
        }
        if (hashMap.containsKey(targetSum)) {
            return hashMap.get(targetSum);
        }
        for (int i : numbers) {
            int remainder = targetSum - i;
            int[] remainderResult = how(remainder, numbers, hashMap);
            if (remainderResult != null) {
                int[] result = new int[remainderResult.length + 1];
                result[0] = i;
                System.arraycopy(remainderResult, 0, result, 1, remainderResult.length);
                hashMap.put(targetSum, result);
                return result;
            }
        }
        hashMap.put(targetSum, null);
        return null;
    }

    // private static int[] how(int targetSum, int[] numbers) {
    //     if (targetSum == 0) {
    //         return new int[0];
    //     }
    //     if (targetSum < 0) {
    //         return null;
    //     }
    //     for (int num : numbers) {
    //         int remainder = targetSum - num;
    //         int[] remainderResult = how(remainder, numbers);
    //         if (remainderResult != null) {
    //             int[] result = new int[remainderResult.length + 1];
    //             result[0] = num;
    //             System.arraycopy(remainderResult, 0, result, 1, remainderResult.length);
    //             return result;
    //         }
    //     }
    //     return null;
    // }
}
