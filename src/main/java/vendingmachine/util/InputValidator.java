package vendingmachine.util;

public class InputValidator {
    private final static String ONLY_NUMBER = "\\d+";

    public static void validateIsNumber(String value) {
        if (!value.matches(ONLY_NUMBER)) {
            throw new IllegalArgumentException("숫자 형태로 입력해주세요.");
        }
    }

    public static void validateChoiceRange(String value, int rangeEnd) {
        int choice = Integer.parseInt(value);
        if (choice < 1 || choice > rangeEnd) {
            throw new IllegalArgumentException("입력한 숫자에 해당하는 음료가 존재하지 않습니다.");
        }
    }
}
