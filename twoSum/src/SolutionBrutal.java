class SolutionBrutal {
    public int[] twoSum(int[] nums, int target) {
        int startLoopIndex = 0;
        int firstIndex = 0;
        int lastIndex = Integer.MIN_VALUE;

        while (true) {
            if (lastIndex == Integer.MIN_VALUE) {
                firstIndex = startLoopIndex;
                lastIndex = getOneLoop(startLoopIndex, nums, target);
            } else {
                break;
            }
            startLoopIndex++;
        }

        return new int[]{firstIndex, lastIndex};
    }

    private int sum(int a, int b){
        int result = a+b;
        return result;
    }

    private int getOneLoop (int startLoopIndex, int[] nums, int target){
        for (int i = startLoopIndex+1; i < nums.length; i++){
            if(sum(nums[startLoopIndex], nums[i]) == target){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
}