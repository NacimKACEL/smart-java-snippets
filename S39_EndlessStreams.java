import java.util.stream.Stream;
import java.time.LocalDateTime;

interface S39_EndlessStreams {
    static void main(String... args) {
        var dates = Stream
            .generate(LocalDateTime::now)
            .map(LocalDateTime::toString)
            .limit(100)
            .toList();
        System.out.println(dates);
    }
}
