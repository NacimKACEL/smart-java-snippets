import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.Path.of;

interface S37_FileCopy {
    static void main(String... args) throws IOException {
        Files.copy(of("S37_FileCopy.java"), of("App.next"));
    }

}
