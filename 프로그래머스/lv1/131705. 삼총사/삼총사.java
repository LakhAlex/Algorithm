// 작성: 정기윤

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        int count = 0;
        
        while(count <= number.length-3) {
        	for(int i = count + 1; i < number.length; i++) {
        		for(int j = i + 1; j < number.length; j++) {
        			if((number[count] + number[i] + number[j]) == 0) {
        				answer++;
        			}
        		}
        	}
        	count++;
        }
        
        return answer;
    }
}