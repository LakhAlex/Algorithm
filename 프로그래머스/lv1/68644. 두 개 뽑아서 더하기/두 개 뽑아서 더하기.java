import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<String> al = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		String str = String.valueOf((numbers[i] + numbers[j]));
        		if(!(al.contains(str))) {
        			al.add(str);
        		}
        	}
        }
        
        answer = new int [al.size()];
        
        for(int i = 0; i < al.size(); i++) {
        	answer[i] = Integer.parseInt(al.get(i));
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}