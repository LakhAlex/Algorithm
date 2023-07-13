// 작성: 정기윤

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        // (n % 3)해서 나온 나머지를 str에 저장하면 자동으로 3진법 값이 뒤집히게 된다.
        while(n >= 1) {
        	str += String.valueOf(n % 3);
        	n = n / 3;
        }

        // str을 사용해서 뒤집힌 3진법 수를 10진수 수로 만든다.
        for(int i = str.length()-1, k = 1; i >= 0; i--, k *= 3) {
        	answer += (int)(str.charAt(i) - 48) * k;
        }
        
        return answer;
    }
}