class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        
        if(a == b){
            return a;
        }
        
        for(int i = min; i <= max; i++){
            answer += i;
        }
        
        
        
        return answer;
    }
}