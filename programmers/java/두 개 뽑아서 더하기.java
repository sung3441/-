import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList list = new ArrayList();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i != j) {
                    int sum = numbers[i]+numbers[j];
                    if(list.indexOf(sum) == -1) {
                        list.add(sum);
                    }
                }
            } 
        } 
        Collections.sort(list); //오름차순 정렬
        
        return list;
    }
}
