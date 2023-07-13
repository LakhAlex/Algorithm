class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        long sum = 0;
        
        while(temp > 0){
            sum += temp % 10;
            temp = temp / 10;
        }
        
        if(x % sum != 0){
            answer = false;
        }
        
        
        return answer;
    }
}