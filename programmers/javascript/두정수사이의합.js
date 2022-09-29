function solution(a, b) {
    var answer = 0;
    var big = 0;
    var small = 0;
    if(a >= b){
        big = a;
        small = b;
    }else{
        big = b;
        small = a;
    }
    
    for(var i = small; i <= big; i++){
        answer += i;
    }
    return answer;
}
