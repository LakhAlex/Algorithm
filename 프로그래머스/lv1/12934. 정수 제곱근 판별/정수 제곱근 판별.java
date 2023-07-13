class Solution {
    public long solution(long n) {
        long answer = -1;
		long num = (long) Math.sqrt(n);
		
		if(n == (num * num)) {
			answer = num + 1;
			answer = answer * answer;
		}
        
        
        return answer;
    }
}