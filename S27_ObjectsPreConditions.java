import java.time.LocalDateTime;
import java.util.Objects;

public class S27_ObjectsPreConditions {

    static String error() {
        return "input please now: " + LocalDateTime.now();
    }

    static void parametterPlease(String input) {
        Objects.requireNonNull(input, S27_ObjectsPreConditions::error);
    }

    public static void main(String... args) {
        parametterPlease(null);
    }

}
