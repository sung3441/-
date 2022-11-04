class 문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = false;
        if((s.length() == 4 || s.length() == 6) && s.length() == s.replaceAll("[^0-9]", "").length()) answer = true;
        return answer;
    }
}
