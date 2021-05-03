function solution(array, commands) {
    var answer = [];
    for(var i = 0; i < commands.length; i++){
        //일회성으로 쓰이는 배열, 잘라낸 값 저장
        var x = [];
        //값 잘라내기 slice의 첫 번째 인자는 인덱스를 뜻하고, 두번 째 인자는 몇번째를 의미하므로, -1이 필요없다.
        x = array.slice((commands[i][0])-1, commands[i][1]);
        //각 배열안의 값을 문자열로 판단하여 1, 100, 50, 10 => 1, 10, 100, 50 이렇게 정렬됨
        x = x.sort(function(a, b){return a-b;});
        //k번째 값을 찾아서 정답 배열에 넣기
        answer.push(x[(commands[i][2])-1]);
    }
    return answer;
}
