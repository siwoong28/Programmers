class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int count = 1;
        while(true){
            if(5500*count<=money){
                count++;
            }
            else{
                answer[0] = count-1;
                answer[1] = money-5500*(count-1);
                break;
            }
        }
        return answer;
    }
}