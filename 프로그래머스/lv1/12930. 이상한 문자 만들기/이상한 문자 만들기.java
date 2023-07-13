// 작성: 정기윤

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i = 0, count = 0; i < s.length(); i++, count++) {
        	if(s.charAt(i) == ' ') {// 공백일 경우
        		answer += " ";
        		count = -1;
        		continue;
        	}
        	if(count % 2 == 0) {
        		answer += String.valueOf(s.charAt(i)).toUpperCase();
        		continue;
        	}
        	answer += String.valueOf(s.charAt(i)).toLowerCase();
        }
        
        return answer;
    }
}