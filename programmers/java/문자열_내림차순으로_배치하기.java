import java.util.Arrays;

class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        char[] sort = s.toCharArray();
        Arrays.sort(sort);
        return new StringBuilder(new String(sort)).reverse().toString();
    }
}
