import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

interface S89_FileCreationTime {
    static void main(String... args) throws IOException{
         var path = Paths.get("./a.txt");
         var at = Files.readAttributes(path, BasicFileAttributes.class);
         var creationTime = at.creationTime();
         System.out.println(creationTime);

    }
}
