import java.util.HashMap;

public class SolutionHash {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapOfNumsWithIndexes = new HashMap();
        for(int i = 0; i< nums.length; i++){
            Integer secondNumber = target-nums[i];
            if(mapOfNumsWithIndexes.containsKey(secondNumber)){
                return new int[]{i, mapOfNumsWithIndexes.get(secondNumber)};
            } else {
                mapOfNumsWithIndexes.put(nums[i], i);
            }
        }

        return null;
    }
}
