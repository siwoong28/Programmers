class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(b>a){
            for(int i = a; i<=b; i++){
                answer +=i;
            }
        }
        else{
            for(int j = b; j<=a; j++){
                answer +=j;
            }
        }
        return answer;
    }
}