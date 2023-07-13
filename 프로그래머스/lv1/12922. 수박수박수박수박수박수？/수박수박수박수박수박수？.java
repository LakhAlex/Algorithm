// 작성: 정기윤

class Solution {
    public String solution(int n) {
        String answer = "";
        
        // for(int i = 1; i <= n; i++){
        //     if(i % 2 == 1){
        //         answer += "수";
        //     }
        //     if(i % 2 == 0){
        //         answer += "박";
        //     }
        // }
        
        for(int i = 0; i < n; i++){
            answer += (i % 2 == 0) ? "수":"박";
        }
        
        return answer;
    }
}