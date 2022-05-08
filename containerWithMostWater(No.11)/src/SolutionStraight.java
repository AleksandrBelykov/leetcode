import java.util.LinkedList;
import java.util.List;

public class SolutionStraight {
    public int maxArea(int[] height) {
        List<Integer> listOfIndexes = new LinkedList<>();

        int index1 = getMaxIndex(height, listOfIndexes);
        int index2 = getMaxIndex(height, listOfIndexes);
        int result = getResult(index1, index2, height);
        int length = getLength(index1, index2);

        while(length != height.length-1){
            int indexN = getMaxIndex(height, listOfIndexes);
            for (Integer index : listOfIndexes) {
                int res = getResult(indexN, index, height);
                if(res > result){
                    result = res;
                }

                int newLength = getLength(indexN, index);
                if(newLength > length){
                    length = newLength;
                }
            }
        }
        return result;
    }

    private int getLength(int index1, int index2) {
        return Math.abs(index1-index2);
    }

    private int getResult(int index1, int index2, int[] height) {
        int x = getLength(index1, index2);
        int y;
        if(height[index1] >= height[index2]){
            y = height[index2];
        } else {
            y = height[index1];
        }
        return x * y;
    }

    private int getMaxIndex(int[] height, List<Integer> listOfIndexes) {
        int max = 0;
        int index = 0;
        for(int i = 0; i < height.length; i++){
            if(height[i] > max && !listOfIndexes.contains(i)){
                max = height[i];
                index = i;
            }
        }
        listOfIndexes.add(index);
        return index;
    }
}