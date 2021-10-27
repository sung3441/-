class Solution {
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
