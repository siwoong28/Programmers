import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        
        Arrays.sort(af);
        Arrays.sort(be);
        
        if(Arrays.equals(be, af)){
            answer = 1;
        }
        
        return answer;
    }
}