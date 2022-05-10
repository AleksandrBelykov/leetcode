import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int reverse(int x) {
        StringBuilder builder = new StringBuilder();
        List<Integer> listOfDigits = new LinkedList<>();
        Long longResult;

        if(x < 0){
            builder.append('-');
        }
        x = Math.abs(x);

        while(x > 0) {
            int temp = x % 10;
            if(temp != 0 || (temp == 0 && !listOfDigits.isEmpty())) {
                listOfDigits.add(temp);
            }
            x /= 10;
        }

        for(int digit : listOfDigits){
            builder.append(digit);
        }

        longResult = Long.parseLong(builder.toString());
        if(longResult < Integer.MIN_VALUE || longResult > Integer.MAX_VALUE){
            return 0;
        } else{
            return longResult.intValue();
        }
    }
}
