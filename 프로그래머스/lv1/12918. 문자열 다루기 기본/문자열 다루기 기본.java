// 작성: 정기윤

class Solution {
	public static boolean solution(String s) {
        
        return (s.length()==4 || s.length() == 6) ? s.matches("(^[0-9]*$)") : false;
    }
}