import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //완주하지 못한 사람의 이름을 담을 변수
        String result = "";
        
        //참가자의 배열을 정렬
        Arrays.sort(participant);
        //완주자의 배열을 정렬
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++){
            if(!completion[i].equals(participant[i])){
                answer = participant[i];
                break;
            }
        }
            
        return answer;
    }
}
