import java.util.stream.Stream;

interface S52_RecordInClass {
    static void main(String... args) {
        record Flag(String flag) {
            boolean isOnLine() {
                return "mode=online".equalsIgnoreCase(this.flag);
            }
        }

        var online = Stream.of(args)
            .map(Flag::new)
            .filter(Flag::isOnLine)
            .findAny()
            .isPresent();
        System.out.println(online);
    }
}
