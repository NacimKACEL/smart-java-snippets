import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

interface S09_ReadFromClipBoard {
    
    static void main (String... args) throws UnsupportedFlavorException,IOException{
        var cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        var content = cb.getData(DataFlavor.stringFlavor);
        System.out.println(content);
    }

}
