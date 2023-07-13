// 작성: 정기윤

class Solution {
    public int solution(String s) {
        int answer = 0;
        String num[] = {
        		"zero", "one", "two", "three", "four", "five", "six",
        		"seven", "eight", "nine"
        };
        
        for(int i = 0; i < num.length; i++) {
        	s = s.replaceAll(num[i], i + "");
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}