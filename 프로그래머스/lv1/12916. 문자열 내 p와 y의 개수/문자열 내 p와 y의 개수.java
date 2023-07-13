class Solution {
    boolean solution(String s) {
        
        int pc = 0, yc = 0;
        String str[] = s.toLowerCase().split("");
        
        for(String s1 : str) {
        	if("p".equals(s1)) {
        		pc++;
        	}
        	if("y".equals(s1)) {
        		yc++;
        	}
        }
        
        if(pc != yc) {
        	return false;
        }
        
        
        return true;
    }
}