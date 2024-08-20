class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum = 0;
        boolean flag =false;
        for(int i = 0; i<num_list.length; i++){
            if(num_list.length>=11){
                sum += num_list[i];
                flag = true;
            }
            else{
                answer *= num_list[i];
                flag = false;
            }
        }
        if(flag == true){
            return sum;
        }
        return answer;
    }
}