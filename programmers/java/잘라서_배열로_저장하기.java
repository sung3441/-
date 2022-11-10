public class 잘라서_배열로_저장하기 {

    public static void main(String[] args) {
        잘라서_배열로_저장하기 s = new 잘라서_배열로_저장하기();
        String[] arr = s.solution("abc1Addfggg4556b", 6);
        for (String str : arr) {
            System.out.println(str);
        }
    }

    String[] solution(String my_str, int n) {
        // 16
        // 0~5, 6~11, 12~15
        String[] result = new String[(int) Math.ceil((double) my_str.length() / n)];
        for (int i = 0; i < result.length; i++) {
            int startIndex = i * n;
            int endIndex = startIndex + n > my_str.length() ? my_str.length() : startIndex + n;
            result[i] = my_str.substring(startIndex, endIndex);
        }
        return result;
    }
}
