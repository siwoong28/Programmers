class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String answer = "";
        answer = sb.reverse().toString();
        return answer;
    }
}