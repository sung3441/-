public class 다음에_올_숫자 {
    public int solution(int[] common) {
        if (isDifference(common)) {
            return common[common.length - 1] + (common[1] - common[0]);
        }
        return common[common.length - 1] * getMultiply(common);
    }

    boolean isDifference(int[] common) {
        int sub1 = common[1] - common[0];
        int sub2 = common[2] - common[1];
        return sub1 == sub2;
    }

    private int getMultiply(int[] common) {
        int multiply = Math.abs(common[1]) / Math.abs(common[0]);
        return isNegative(common) ? multiply * -1 : multiply;
    }

    boolean isNegative(int[] common) {
        if (common[0] >= 0 && common[1] < 0 || common[0] < 0 && common[1] >= 0) {
            return true;
        }
        return false;
    }
}