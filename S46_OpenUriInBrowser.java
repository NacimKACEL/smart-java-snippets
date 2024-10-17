import java.io.IOException;
import java.net.URI;
import java.awt.Desktop;

interface S46_OpenUriInBrowser {

    static void main(String... args) throws IOException{
        var uri = URI.create("https://www.google.com/");
        Desktop.getDesktop().browse(uri);
    }

}
