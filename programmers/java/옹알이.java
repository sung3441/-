public class 옹알이 {
    String[] sounds = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int result = 0;
        for (String word : babbling) {
            if (includeSound(word)) {
                result++;
            }
        }
        return result;
    }

    boolean includeSound(String originalWord) {
        String word = originalWord;
        String preWord = "";

        while (true) {
            int length = word.length();
            for (String sound : sounds) {
                if (!word.contains(sound)) {
                    continue;
                }
                String tempWord = word.substring(0, sound.length());
                if (preWord.equals(tempWord)) {
                    return false;
                }
                if (sound.equals(tempWord)) {
                    word = word.substring(sound.length());
                    preWord = tempWord;
                    break;
                }
            }
            if (length == word.length()) {
                return false;
            }

            if (word.length() == 0) {
                return true;
            }
        }
    }
}
