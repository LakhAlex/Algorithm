import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int answer [] = {-1};
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i : arr) {
        	if(i % divisor == 0) {
        		al.add(i);
        	}
        }
        
        if(al.size() == 0) {
        	return answer;
        }
        
        answer = new int[al.size()];
        
        for(int i = 0; i < al.size(); i++) {
        	answer[i] = al.get(i);
        }
        
        for(int i = answer.length-1; i > 0; i--) {
        	for(int j = 0; j < i; j++) {
        		if(answer[j] > answer[j+1]) {
        			int temp = answer[j];
        			answer[j] = answer[j+1];
        			answer[j+1] = temp;
        		}
        	}
        }
        
        
        
        
        return answer;
    }
}