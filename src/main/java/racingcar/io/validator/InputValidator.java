package racingcar.io.validator;

public class InputValidator {

    public static void validateIntFormat(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("입력 값이 정수가 아닙니다.");
        }
    }
}
