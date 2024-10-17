import java.nio.file.Files;
import java.io.IOException;
/*
 * For Unit test, it's perfect. We generate temporaires files for units tests
 * We execute tests, and clean up 
 */
interface S30_CreateTempFolder {

    static void main(String... args) throws IOException{
        var temp = Files.createTempDirectory("temptests");
        System.out.println(temp);
    }

}
