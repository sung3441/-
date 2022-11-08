public class 햄버거_만들기 {

    public int solution(int [] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ingredient.length; i++) {
            sb.append(ingredient[i]);
            if (sb.length() < 4) {
                continue;
            }
            if ("1231".equals(sb.substring(sb.length() - 4, sb.length()))) {
                answer++;
                sb.delete(sb.length() - 4, sb.length());
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        햄버거_만들기 solution = new 햄버거_만들기();
        int result1 = solution.solution(new int[]{1, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1});
        int result2 = solution.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});
        int result3 = solution.solution(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1});
        int result4 = solution.solution(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1});
        int result5 = solution.solution(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1});
        int result6 = solution.solution(new int[]{1, 2, 2, 3, 1});

        System.out.println("1번 정답: 3, 제출한 값: " + result1);
        System.out.println("2번 정답: 0, 제출한 값: " + result2);
        System.out.println("3번 정답: 5, 제출한 값: " + result3);
        System.out.println("4번 정답: 3, 제출한 값: " + result4);
        System.out.println("5번 정답: 3, 제출한 값: " + result5);
        System.out.println("6번 정답: 0, 제출한 값: " + result6);
    }
}
