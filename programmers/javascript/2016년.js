function solution(a, b) {
    var dayAr = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
    var answer = '';
    var d = new Date(2016, a-1, b);
    var day = d.getDay(d);
    answer = dayAr[day];
    return answer;
}
