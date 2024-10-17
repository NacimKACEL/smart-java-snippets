import java.util.stream.Stream;
import java.util.stream.Collectors;

interface S38_StreamArrayToStream {
    static void main(String... args) {
        var stringArgs = Stream
            .of(args)
            .map(String::toUpperCase)
            .collect(Collectors.joining(","));
        
        System.out.println(stringArgs); 
    }
}
