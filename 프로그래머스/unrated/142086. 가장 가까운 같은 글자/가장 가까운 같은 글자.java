// 작성: 정기윤

class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        
        // 맨 처음 오는 문자는 무조건 처음이라서 -1이다.
        answer[0] = -1;
        
        for(int i = 1; i < s.length(); i++) {
        	// 글자를 1개씩 끊어서 가져옴
        	System.out.println("s.substring(i, i+1): " + s.substring(i, i+1));
        	int t = s.lastIndexOf(s.substring(i, i+1), i-1);
        	// s.lastIndexOf()를 사용하며, s라고 하는 문자열의 i-1번째 인덱스 부터
        	// subString을 통해서 나온 문자를 분자열 반대방향으로 탐색을 진행한다.
        	
        	if(t != -1) { // 문자가 한 이상 나온 경우 
        		answer[i] = i - t;
        	}
        	else { // 한번도 나온 적 없는 문자일 경우
        		answer[i] = t;
        	}
        }
        
        return answer;
    }
}