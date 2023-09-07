import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int r_score[] = new int[score.length];
        int count = 0;
        
        Arrays.sort(score);
        
        for(int i = 0; i < score.length; i++) {
        	r_score[i] = score[score.length-1-i];
        }
        
        for(int i = 0; i < r_score.length; i++) {
        	if(count > score.length || count + m > score.length) {
        		break;
        	}
        	answer += r_score[count + m -1] * m;
        	count += m;
        }
        
        return answer;
    }
}