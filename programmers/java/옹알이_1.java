public class 옹알이_1 {

    int solution(String[] babbling) {
        int answer = 0;
        String[] sounds = new String[]{"aya", "ye", "woo", "ma"};

        for (String str : babbling) {
            if (str.length() < 2 || str.length() > 10) {
                continue;
            }
            while (true) {
                int originalLength = str.length();
                for (String sound : sounds) {
                    if (str.length() < sound.length()) {
                        continue;
                    }
                    if (sound.equals(str.substring(0, sound.length()))) {
                        str = str.substring(sound.length());
                    }
                }
                if (originalLength == str.length()) {
                    break;
                }
                if (str.length() == 0) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        옹알이_1 s = new 옹알이_1();

        int result1 = s.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        int result2 = s.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
