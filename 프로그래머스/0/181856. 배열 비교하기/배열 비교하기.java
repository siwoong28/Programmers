class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int count = 0;
        int count2 = 0;
        
        if(arr1.length>arr2.length){
            answer = 1;
        }
        else if(arr1.length<arr2.length){
            answer = -1;
        }
        else{
            for(int i = 0; i<arr1.length; i++){
                count+=arr1[i];
            }
            for(int j = 0; j<arr2.length; j++){
                count2 +=arr2[j];
            }
            if(count>count2){
                answer = 1;
            }
            else if(count<count2){
                answer = -1;
            }
            else{
                answer = 0;
            }
        }
        return answer;
    }
}