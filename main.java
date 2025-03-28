import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Two_Sum solution = new Two_Sum();

        int[] nums = {3,2,4};
        int target = 6;

        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));  // Expected output: [0, 1]
    }
}