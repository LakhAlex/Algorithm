class Solution {
    public String solution(String str1) {
        String answer = str1.substring(0, str1.length()-4).replaceAll("[0-9]", "*") + str1.substring(str1.length()-4);
        return answer;
    }
}