import java.util.Arrays;
import java.util.stream.Collectors;

public class 칠의_개수 {

    public static void main(String[] args) {
        칠의_개수 s = new 칠의_개수();
        int result = s.solution(new int[]{7, 77, 17});
        System.out.println("result = " + result);
    }

    int solution(int[] array) {
        String str = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(""));
        return str.length() - str.replace("7", "").length();
    }
}