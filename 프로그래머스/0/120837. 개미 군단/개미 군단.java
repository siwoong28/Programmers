class Solution {
    public int solution(int hp) {
        int answer = 0;
        int temp = (hp%5)/3;
        int third = (hp%5)%3;
        answer = hp/5 + temp + third;
        return answer;
    }
}