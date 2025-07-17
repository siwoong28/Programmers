function solution(my_string) {
    var answer = [];
    for(let x of my_string){
        if(!isNaN(x)){
            x = Number(x);
            answer.push(x);
        }
    }
    answer.sort();
    return answer;
}