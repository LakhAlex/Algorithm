// 작성: 정기윤

class Solution {
    public static boolean isPrime(long sum) {
		int k = 2;
		long sum_sqrt = (long)Math.sqrt(sum);
		while(sum_sqrt >= k) {
			if(sum % k++ == 0) {
				return false;
			}
		}
		return true;
	}
	public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        
        while(count < nums.length-2) {
        	for(int i = count + 1; i < nums.length; i++) {
        		for(int j = i + 1; j < nums.length; j++) {
        			long sum = nums[count] + nums[i] + nums[j];
        			System.out.println(sum);
        			if(isPrime(sum)) {
        				answer++;
        			}
        		}
        	}
        	count++;
        }
        
        System.out.println("answer: " + answer);

        return answer;
    }
}