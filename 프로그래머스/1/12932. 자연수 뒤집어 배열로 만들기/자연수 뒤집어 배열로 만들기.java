class Solution {
    public int[] solution(long n) {
        
        String number = ""+n;
        int[] answer = new int[number.length()];
        int idx = number.length()-1;
        for(int i = 0; i<number.length(); i++) {
            int num = number.charAt(idx--) - '0';
            answer[i] = num;
        }
        return answer;
    }
}