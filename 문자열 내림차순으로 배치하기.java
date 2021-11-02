import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] sort = s.toCharArray();
        Arrays.sort(sort);
        return new StringBuilder(new String(sort)).reverse().toString();
    }
}
