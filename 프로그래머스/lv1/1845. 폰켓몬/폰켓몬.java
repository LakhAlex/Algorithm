// 작성: 정기윤

import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        int count = 0;
        
        Arrays.sort(nums);
        count = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
        	if(count != nums[i]) {
        		answer++;
        		count = nums[i];
        	}
        }
        
        if(nums.length / 2 < answer) {
        	answer = nums.length / 2;
        }
        
        return answer;
    }
}