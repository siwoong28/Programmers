import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        char[] af = my_string.toCharArray();
        Arrays.sort(af);
        
        answer = new String(af);
        
        return answer;
    }
}