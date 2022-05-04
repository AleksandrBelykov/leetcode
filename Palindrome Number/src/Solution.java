import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }

        List<Integer> list = new ArrayList<>();
        while (x > 0){
            list.add(x%10);
            x=x/10;
        }

        System.out.println(list);
        System.out.println(isOddSize(list));
        System.out.println(list.size());
        System.out.println(findMedianIndex(list));

        int startIndex = 0;
        int endIndex = list.size()-1;
        int medianIndex = findMedianIndex(list);

        if (isOddSize(list)){
            while(startIndex<medianIndex && endIndex > medianIndex){
                System.out.println(""+startIndex +" and "+endIndex);
                if(list.get(startIndex) != list.get(endIndex)){
                    return false;
                }
                startIndex++;
                endIndex--;
            }
        } else {
            while(startIndex<medianIndex && endIndex >= medianIndex){
                System.out.println(""+startIndex +" and "+endIndex);
                if(list.get(startIndex) != list.get(endIndex)){
                    return false;
                }
                startIndex++;
                endIndex--;
            }
        }

        return true;
    }

    private boolean isOddSize(List<Integer> list){
       if (list.size()%2 != 0) {
           return true;
       } else{
           return false;
       }
    }

    private int findMedianIndex (List<Integer> list){
        return list.size()/2;
    }
}
