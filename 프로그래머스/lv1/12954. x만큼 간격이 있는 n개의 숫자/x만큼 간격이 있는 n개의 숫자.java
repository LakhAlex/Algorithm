class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long [n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                answer[i] += x;
            }
        }
        
        return answer;
    }
}