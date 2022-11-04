import java.util.ArrayList;

class 크레인_인형뽑기_게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList list = new ArrayList();

        int cnt = 0;
        
        for(int move : moves) {
            boolean flag = true;
            for(int i = 0; i < board.length; i++) {
                if(board[i][move-1] != 0 && flag) {
                    list.add(board[i][move-1]);
                    board[i][move-1] = 0;
                    flag = false;
                    if(list.size() > 1) {                 
                        if(list.get(list.size()-1) == list.get(list.size()-2)) {
                            list.remove(list.size()-1);
                            list.remove(list.size()-1);
                            cnt += 2;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
