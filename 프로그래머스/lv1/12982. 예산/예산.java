// 작성: 정기윤

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        for(int i = 0; i < d.length; i++) {
        	for(int j = d.length-1; j > 0; j--) {
        		if(d[j] < d[j-1]) {
        			int tmp = d[j];
        			d[j] = d[j-1];
        			d[j-1] = tmp;
        		}
        	}
        }
        
        
        for(int i = 0; i < d.length; i++) {
        	if(budget < d[i]) {
        		break;
        	}
        	answer++;
        	budget -= d[i];
        }
        
        return answer;
    }
}