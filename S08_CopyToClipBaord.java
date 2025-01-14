import java.awt.Toolkit;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.awt.datatransfer.DataFlavor;

interface S08_CopyToClipBaord {
    static void main(String... args) {
        var message = "from java" + System.nanoTime();
        var cb = Toolkit.getDefaultToolkit().getSystemClipboard();

        cb.setContents(
            new Transferable() {
            @Override
            public DataFlavor[] getTransferDataFlavors() {
                return new DataFlavor[] {DataFlavor.stringFlavor};
            }

            @Override
            public boolean isDataFlavorSupported(DataFlavor flavor) {
                return true;
            }

            @Override
            public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
                return message;
            }

            },
            (c,b) -> {});
    }

}
