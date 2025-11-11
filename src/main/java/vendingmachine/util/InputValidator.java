package vendingmachine.util;

public class InputValidator {
    private final static String ONLY_NUMBER = "\\d+";

    public static void validateIsNumber(String value) {
        if (!value.matches(ONLY_NUMBER)) {
            throw new IllegalArgumentException("숫자 형태로 입력해주세요.");
        }
    }
}
