// 작성: 정기윤

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes"; // 기본 값으로 Yes를 줌, cards1과 cards2에 있는 값이 goal과 비교하던 중 하나라도 틀릴 경우 answer = "No"로 설정한다.
		int index1 = 0, index2 = 0; // cards1과 cards2를 따로 접근할 변수

        for (int i = 0; i < goal.length; i++) {
            if (cards1.length > index1 && goal[i].equals(cards1[index1])) {
                index1++;
            } 
            else if (cards2.length > index2 && goal[i].equals(cards2[index2])) {
                index2++;
            } 
            else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}