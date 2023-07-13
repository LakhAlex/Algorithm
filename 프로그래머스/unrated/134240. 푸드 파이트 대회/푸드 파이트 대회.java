// 작성: 정기윤

class Solution {
    public String solution(int[] food) {
        String answer = "";
	    
	    for(int i = 1; i < food.length; i++) {
	    	int count = food[i]/2;
	    	if(count == 0) {
	    		continue;
	    	}
	    	for(int j = 0; j < count; j++) {
	    		answer += String.valueOf(i);
	    	}
	    }
	    
	    StringBuilder sb = new StringBuilder(answer);
	    
	    answer += "0" + sb.reverse();
	    
	    System.out.println(answer);
	    
	    return answer;
    }
}