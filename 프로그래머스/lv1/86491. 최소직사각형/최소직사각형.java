// 작성: 정기윤

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int xmax = 0, ymax = 0;
        
        for(int i = 0; i < sizes.length; i++) {
        	for(int j = 0; j < sizes[i].length - 1; j++) {
        		if(sizes[i][j] < sizes[i][j + 1]) {
        			answer = sizes[i][j];
        			sizes[i][j] = sizes[i][j + 1];
        			sizes[i][j + 1] = answer;
        		}
        	}
        }
        
        for(int i = 0; i < sizes.length; i++) {
        	xmax = Math.max(xmax, sizes[i][0]);
        }
        for(int i = 0; i < sizes.length; i++) {
        	ymax = Math.max(ymax, sizes[i][1]);
        }
        
        answer = xmax * ymax;
        
        return answer;
    }
}