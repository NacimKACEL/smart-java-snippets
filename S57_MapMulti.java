import java.util.function.Consumer;
import java.util.stream.Stream;

// It's simular to FlatMap but faster, the advantage is 0 or more

interface S57_MapMulti {
    static void expand(String csv, Consumer<String> sink) {
        for (var e : csv.split(",")) {
            sink.accept(e);
        }
    }

    static void main(String... args) {
        var csv = Stream.of("hello", "world","duke", "java");
        var expanded = csv.mapMulti(S57_MapMulti::expand)
            .toList();
        System.out.println(expanded);
    }
}
