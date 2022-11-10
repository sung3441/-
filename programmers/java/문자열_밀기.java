import java.util.Arrays;

public class 문자열_밀기 {

    public static void main(String[] args) {
        문자열_밀기 s = new 문자열_밀기();
        s.solution("abc", "cab");
    }

    int solution(String a, String b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i < a.length(); i++) {
            if (b.equals(sb.toString())) {
                return answer;
            }
            sb.insert(0, sb.substring(sb.length() - 1));
            sb.delete(sb.length() - 1, sb.length());
            answer++;
        }
        return -1;
    }

    void shift(String[] arr) {
        String temp = arr[0];
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
