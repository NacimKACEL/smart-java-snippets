import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface S71_CloseIOStreams {

    static void main(String... args) throws IOException{
        var dir = Path.of(".");
        try (var files = Files.list(dir)
                    .map(Path::toString)
                    .filter( f -> f.endsWith(".txt"))
                    .sorted()){
            System.out.println(files.toList());

        }
    }
}
