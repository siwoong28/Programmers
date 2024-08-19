class Solution {
    public int[] solution(int start_num, int end_num) {
        int a = start_num - end_num + 1;
        int[] answer = new int[a];
        for (int i = 0; i < a; i++) {
            answer[i] = start_num - i;
        }
        return answer;
    }
}
