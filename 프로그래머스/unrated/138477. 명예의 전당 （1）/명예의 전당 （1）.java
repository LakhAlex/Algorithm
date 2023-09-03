import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
	        ArrayList<Integer> rank = new ArrayList<>();
	        
	        for(int i = 0; i < score.length; i++) {
	        	if(rank.size() < k) {
	        		rank.add(score[i]);
	        		Collections.sort(rank);
	        		answer[i] = rank.get(0);
                    continue;
	        	}
	        	if(rank.size() == k) {
	        		int tmp = rank.get(0);
	        		if(tmp < score[i]) {
	        			rank.remove(0);
	        			rank.add(score[i]);
	        			Collections.sort(rank);
	        		}
	        		answer[i] = rank.get(0);
	        	}
	        }
	        
        
        return answer;
    }
}