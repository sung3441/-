class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        return phone_number.replace(phone_number.substring(0, phone_number.length() - 4), "*".repeat(phone_number.length() - 4));
    }
}
