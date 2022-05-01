import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,4,8,19,21, -10};
        int target = 22;

        SolutionBrutal solution = new SolutionBrutal();
        int[] result = solution.twoSum(nums, target);
        System.out.println("brutal solution result is "+Arrays.toString(result));

        SolutionHash sol = new SolutionHash();
        int[] res = sol.twoSum(nums, target);
        System.out.println("hash solution result is "+Arrays.toString(result));
    }
}
