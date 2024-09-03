class Solution {
    public int[] solution(int[] num_list) {
        int temp = num_list.length;
        int[] answer = new int[num_list.length];
            for(int i = 0; i<num_list.length; i++){
                answer[i] = num_list[temp-i-1];
            }
        return answer;
    }
}