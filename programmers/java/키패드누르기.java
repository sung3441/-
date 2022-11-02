public class 키패드누르기 {
    Position left;
    Position right;
    Position numPos;

    String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        left = new Position(3, 0);
        right = new Position(3, 2);
        numPos = new Position(0, 0);

        for (int number : numbers) {
            numPos = new Position((number - 1) / 3, (number - 1) % 3);
            if (number == 0)
                numPos = new Position(3, 1);

            String finger = numPos.getFinger(hand);
            answer.append(finger);

            if (finger.equals("L")) {
                left = numPos;
                continue;
            }
            right = numPos;
        }
        return answer.toString();
    }

    class Position {
        int row;
        int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        String getFinger(String hand) {
            String finger = hand.equals("left") ? "L" : "R";
            if (this.col == 0) finger = "L";
            else if (this.col == 2) finger = "R";
            else {
                int leftDist = left.getDistance(this);
                int rightDist = right.getDistance(this);

                if (leftDist < rightDist) finger = "L";
                else if (rightDist < leftDist) finger = "R";
            }
            return finger;
        }

        int getDistance(Position position) {
            return Math.abs(this.col - position.col) + Math.abs(this.row - position.row);
        }

    }

    public static void main(String[] args) {
        키패드누르기 sol = new 키패드누르기();
        int[] number = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
    }
}
