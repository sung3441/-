public class 평행 {

    public static void main(String[] args) {
        평행 s = new 평행();
        int result1 = s.solution(new int[][]{
                new int[]{1, 4},
                new int[]{9, 2},
                new int[]{3, 8},
                new int[]{11, 6}
        });

        int result2 = s.solution(new int[][]{
                new int[]{3, 5},
                new int[]{4, 1},
                new int[]{2, 4},
                new int[]{1, 0}
        });

        int result3 = s.solution(new int[][]{
                new int[]{0, 0},
                new int[]{4, 4},
                new int[]{2, 2},
                new int[]{9, 9}
        });

        int result4 = s.solution(new int[][]{
                new int[]{3, 0},
                new int[]{3, 6},
                new int[]{3, 1},
                new int[]{3, 11}
        });

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }

    public int solution(int[][] dots) {
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                int point = (Math.abs(i - j)) % 2 == 0 ? 1 : 2;
                int indexI = (j + point) % 4;
                int indexJ = (i + point) % 4;

                int x1 = dots[i][0] - dots[j][0];
                int y1 = dots[i][1] - dots[j][1];
                int x2 = dots[indexI][0] - dots[indexJ][0];
                int y2 = dots[indexI][1] - dots[indexJ][1];

                if ((double) x1 / y1 == (double) x2 / y2) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
