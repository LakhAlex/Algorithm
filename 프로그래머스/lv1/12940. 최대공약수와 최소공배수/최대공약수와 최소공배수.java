// 작성: 정기윤

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int gcd = 1;
        answer[0] = n;
        answer[1] = m;
        
        // 최대 공약수 구하기
        while(gcd != 0){
            gcd = answer[0] % answer[1];
            answer[0] = answer[1];
            answer[1] = gcd;
        }
        
        // 최소 공배수 구하기
        answer[1] = (n * m) / answer[0];
        
        
        return answer;
    }
}