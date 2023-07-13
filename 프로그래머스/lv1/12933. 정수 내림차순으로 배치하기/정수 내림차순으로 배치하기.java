class Solution {
    public long solution(long n) {
		String answer = "";
        String str = Long.toString(n);
        
        int[] arr = new int[str.length()];
        
        
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arr[i] = (int) (c - 48);
        }
        
        for(int j = 0; j < str.length(); j++){
            for(int i = j; i > 0; i--) {
                if (arr[i] > arr[i-1]) {
                    int tmp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        
        for(int i = 0; i < str.length(); i++){
            answer += arr[i];
        }
        
        return Long.parseLong(answer);
    }
}