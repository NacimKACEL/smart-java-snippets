import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

/*
 * Util for bigdata search for csv files for example  
 */

interface S32_DirectoryStream {

    static void createDirectory() throws IOException{
        for(int i=0; i<10; i++) {
            Files.createDirectories(Path.of("./directory_" + i));
        }
    }

    static void main(String... args) throws IOException{
        //createDirectory();
        var root = Path.of(".");
        Files.newDirectoryStream(root)
            .forEach(System.out::println);
    }

}
