import java.io.IOException;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import java.nio.file.Path;

interface S78_SystemLoggerConfiguration {

    static void main(String... args) throws IOException{
        var logger = System.getLogger("S78_SystemLoggerConfiguration");
        logger.log(Level.INFO, "hello");
        var javaHome = System.getProperty("java.home");
        var path = Path.of(javaHome, "conf", "logging.properties");
        var config = Files.readString(path);
        System.out.println(config);
    }
}
