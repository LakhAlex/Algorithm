// 작성: 정기윤

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char c [] = s.toCharArray();
        
        Arrays.sort(c);
        
        for(int i = c.length-1; i >=0; i--) {
        	answer += String.valueOf(c[i]);
        }
        
        // System.out.println(answer);
        
        return answer;
    }
}