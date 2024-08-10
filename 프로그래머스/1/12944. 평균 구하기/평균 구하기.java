class Solution {
    public double solution(int[] arr) {
        double add = 0;
        for(int i = 0; i<arr.length; i++){
            add+=arr[i];
        }
        double answer = add/arr.length;
        return answer;
    }
}