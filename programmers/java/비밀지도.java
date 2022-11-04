class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for(int i = 0; i < n; i++) {
            String data = Integer.toBinaryString(arr1[i] | arr2[i]).length() < n ?
                " ".repeat(n-(Integer.toBinaryString(arr1[i] | arr2[i])).length())+(Integer.toBinaryString(arr1[i] | arr2[i]))
                :Integer.toBinaryString(arr1[i] | arr2[i]);
            result[i] = data.replaceAll("0", " ").replace("1", "#");
        }
        return result;
    }
}
