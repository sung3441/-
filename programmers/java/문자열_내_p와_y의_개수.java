class 문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int pCnt = s.length() - s.replace("p", "").length();
        int yCnt = s.length() - s.replace("y", "").length();

        if((s.length() != pCnt || s.length() != yCnt) && pCnt != yCnt) {
            answer = false;
        }

        return answer;
    }
}
