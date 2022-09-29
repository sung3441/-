class Solution {
  public int[] solution(int[] lottos, int[] win_nums) {
    int zeroCnt = 0;
    int numCnt = 0;
    int answer[] = new int[2];
    for(int lotto : lottos){
      if(lotto == 0) zeroCnt++;
      for(int win_num : win_nums){
        if(lotto == win_num){
          numCnt++;
        }
      }
    }        
    int max = (numCnt == 0 && zeroCnt == 0)? 6 : 7-(numCnt + zeroCnt);
    int min = (numCnt == 0)? 6 : 7-numCnt;
    answer[0] = max;
    answer[1] = min;
    return answer;
  }
}
