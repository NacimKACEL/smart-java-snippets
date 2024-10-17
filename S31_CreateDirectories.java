import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

/*
 * it's like mkdir -p with the hirarchie
 */

interface S31_CreateDirectories {

    static void main(String... args) throws IOException{
        var path = Path.of("/Users/nkacel/Workspace/dev/training/smart-java-snippets/lab");
        Files.createDirectories(path);
    }
 
}
