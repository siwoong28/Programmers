class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String first_num = Integer.toString(a) + Integer.toString(b);
        String second_num = Integer.toString(b) + Integer.toString(a);
        int fir_num = Integer.parseInt(first_num);
        int se_num = Integer.parseInt(second_num);
        if(fir_num>=se_num){
            answer = fir_num;
        }
        else{
            answer = se_num;
        }
        return answer;
    }
}