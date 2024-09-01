class Solution {
    public int solution(int n) {
        int answer = 2;
        int temp = 1;
        while(temp*temp<=n){
            if (temp*temp == n) {
                answer = 1;
                break;
            }
            temp++;
        }
        return answer;
    }
}