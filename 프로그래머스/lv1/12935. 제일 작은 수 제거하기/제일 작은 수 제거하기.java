import java.util.ArrayList;
class Solution {
    public int[] solution(int[] ex1) {
        int answer[] = new int [ex1.length - 1];
		int min = ex1[0];
		
		if(ex1.length == 1) {
			return new int[] {-1};
		}
		
		for(int i = 0; i < ex1.length;i++) {
			min = Math.min(min, ex1[i]);
		}
		
		for(int i = 0, k = 0; i < ex1.length; i++) {
			if(ex1[i] == min) {
				continue;
			}
			answer[k++] = ex1[i];
		}
		
		// for(int i : answer) {
		// 	System.out.println(i);
		// }
        
        return answer;
    }
}