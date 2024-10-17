/*
 * Enable assert -ea
 */

public class S20_Assert {
    static void parameterNeeded(String input) {
        assert input != null;
    }

    public static void main(String... args) {
        parameterNeeded(null);
    }
}
