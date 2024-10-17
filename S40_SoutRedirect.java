import java.io.FileNotFoundException;
import java.io.PrintStream;

interface S40_SoutRedirect {
    static void main(String... args) throws FileNotFoundException {
        var s = new PrintStream("log.file");
        System.setOut(s);
        System.out.println("Hello, nacim");
    }
}
