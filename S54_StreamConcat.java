import java.util.stream.Stream;
import java.util.List;

interface S54_StreamConcat {
    static void main(String... args) {
        var first = List.of(1,2).stream();
        var second = List.of(3,4).stream();

        var result = Stream.concat(first, second).toList();

        System.out.println(result);
    }

}
