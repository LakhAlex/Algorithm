// 작성: 정기윤

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	if(ch == ' ') {
        		answer += " ";
        		continue;
        	}
        	if(ch >= 97 && ch <= 122) {
        		if(ch+n > 122) {
        			answer += (char)(ch - 26 + n);
        			continue;
        		}
        		answer += (char) (ch + n);
        	}
        	else if(ch >= 65 && ch <= 90) {
        		if(ch+n > 90) {
        			answer += (char)(ch - 26 + n);
        			continue;
        		}
        		answer += (char) (ch + n);
        	}
        }
        
        return answer;
    }
}