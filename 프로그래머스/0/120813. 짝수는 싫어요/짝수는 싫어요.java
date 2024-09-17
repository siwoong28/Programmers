class Solution {
    public int[] solution(int n) {
        int count = 0;
        int temp = (n+1)/2;
        int[] answer = new int[temp];
        for(int i = 1; i<=n; i++){
            if(i%2!=0){
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }
}