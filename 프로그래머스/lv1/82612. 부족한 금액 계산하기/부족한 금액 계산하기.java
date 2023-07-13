// 작성: 정기윤

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i = 1; i <= count; i++){
            answer += (price * i);
        }

        return (answer > money) ? answer-money : 0;
    }
}