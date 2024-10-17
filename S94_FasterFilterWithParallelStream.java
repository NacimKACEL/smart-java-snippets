import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

// It's strange normally parallelStream is used when we call somthing out !  

interface S94_FasterFilterWithParallelStream {
    static void main(String... args) {
        var numbers = IntStream.range(0, 100_000_000)
            .boxed()
            .toList();
        
        var start = Instant.now();

        var result = numbers
            //.stream()
            .parallelStream()                
            .filter(n -> n % 2 != 0)
            .toList();
        var duration = Duration.between(start, Instant.now()).toMillis();
        System.out.println("found %d in %dms".formatted(result.size(), duration)) ;
        
    }

}
