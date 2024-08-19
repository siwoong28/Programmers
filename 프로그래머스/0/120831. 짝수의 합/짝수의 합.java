class Solution {
    public int solution(int n) {
        int answer = 0;
        while(true){
            if(n%2==0){
                answer+=n;
                n--;
            }
            else{
                n--;
            }
            if(n<0){
                break;
            }
        }
        return answer;
    }
}