import java.util.Map;
import static java.util.Map.entry;

interface S48_MapOfvsMapOfEntries {

    static void main(String... args) {
        Map.of(
            "1","one",
            "2","two",
            "3", "three",
            "4","four",
            "5","five",
            "6","six",
            "7", "seven",
            "8","eight",
            "9", "nine",
            "10", "ten"
            //"11", "eleven"
        );

        Map.ofEntries(
            entry(1, "one"),
            entry(2,"two"),
            entry(3, "three"),
            entry(4,"four"),
            entry(5,"five"),
            entry(6,"six"),
            entry(7, "seven"),
            entry(8,"eight"),
            entry(9, "nine"),
            entry(10, "ten"),
            entry(11, "eleven")

        );
    }

}
