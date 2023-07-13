class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(num != 1) {
        	if(num % 2 == 1) {
        		num = num * 3 + 1;
        	}
        	else if(num % 2 == 0) {
        		num = num / 2;
        	}
        	answer++;
        	if(answer > 500) {
        		answer = -1;
        		break;
        	}
        	
        	// System.out.println(answer);
        }
        
        
        return answer;
    }
}