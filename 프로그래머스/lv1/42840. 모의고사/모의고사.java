// 작성: 정기윤

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int [] answer = {};
        int score [] = new int [3];
        int p1 [] = {1, 2, 3, 4, 5}; // 1번 수포자
        int p2 [] = {2, 1, 2, 3, 2, 4, 2, 5}; // 2번 수포자
        int p3 [] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 3번 수포자
        
        for(int i = 0; i < answers.length; i++) {
        	// ↓ 원형 스택처럼 나머지를 통해서 인덱스 값 가져오기
        	if(answers[i] == p1[i % p1.length]) score[0]++; 
        	if(answers[i] == p2[i % p2.length]) score[1]++;
        	if(answers[i] == p3[i % p3.length]) score[2]++;
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        for(int i = 0; i < score.length; i++) {
        	if(max == score[i]) {
        		al.add(i+1);
        	}
        }
        		
        answer = new int [al.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = al.get(i);
        }
        
        return answer;
    }
}