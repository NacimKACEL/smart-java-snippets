import java.util.List;
// don't use it in production, it's for debugg perpose
interface S45_Peek {
    static void main(String... args) {
        var result = List.of("a","b","c")
            .stream()
            .filter(s -> s.startsWith("b"))
            .peek(System.out::println)
            .map(s-> "*"+s)
            .peek(System.out::println)
            .toList();
    }
}
