// 작성: 정기윤

import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int [photo.length];
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        
        for(int i = 0; i < name.length; i++){
            a.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++) {
        	for(int j = 0; j <photo[i].length; j++) {
        		if(a.get(photo[i][j]) == null) continue;
        		answer[i] += a.get(photo[i][j]);
        	}
        }
        
        return answer;
    }
}