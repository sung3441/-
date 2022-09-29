class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        for(int i = 1; i <= count; i++) {
            total += (long)price*i;
        }

        long answer = 0;
        if((long)total - money > 0) answer = (long)total - money;
        
        return answer;
    }
}
