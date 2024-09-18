class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String first_num = Integer.toString(a) + Integer.toString(b);
        int second_num = 2*a*b;
        int fir_num = Integer.parseInt(first_num);
        if(fir_num>=second_num){
            answer = fir_num;
        }
        else{
            answer = second_num;
        }
        return answer;
    }
}