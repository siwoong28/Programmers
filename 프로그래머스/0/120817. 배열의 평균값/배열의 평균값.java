class Solution {
    public double solution(int[] numbers) {
        double add = 0;
        for(int i = 0; i<numbers.length; i++){
            add += numbers[i];
        }
        double answer = add/numbers.length;
        return answer;
    }
}