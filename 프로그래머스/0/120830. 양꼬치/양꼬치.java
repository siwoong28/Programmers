class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int free = n/10;
        if(k>=free){
            answer += (k-free)*2000+(12000*n);
        }
        else{
            answer+=12000*n;
        }
        return answer;
    }
}