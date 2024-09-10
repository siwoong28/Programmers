class Solution {
    public String[] solution(String my_string) {
        String[] temp = my_string.split(" ");
        String[] answer = new String[temp.length];
        
        for (int i = 0; i < temp.length; i++) {
            answer[i] = temp[i];
        }
        
        return answer;
    }
}