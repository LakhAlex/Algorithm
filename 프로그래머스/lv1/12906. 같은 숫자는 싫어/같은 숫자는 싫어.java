// 작성: 정기윤

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        ArrayList<Integer> al = new ArrayList<>();
        int temp = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(temp != arr[i]){
                al.add(arr[i]);
            }
            temp = arr[i];
        }
        
        answer = new int [al.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = al.get(i).intValue();
        }

        return answer;
    }
}