import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

interface S66_ClipBoardWatcher {

    static String readClipBoard() throws Exception{
        var cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        return (String) cb.getData(DataFlavor.stringFlavor);
    }

    static void writeClipBoard(String content) {
        var cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        cb.setContents(new Transferable() {
            @Override
            public DataFlavor[] getTransferDataFlavors() {
                return new DataFlavor[] {
                    DataFlavor.stringFlavor
                };
            }

            @Override
            public boolean isDataFlavorSupported(DataFlavor flavor) {
                return true;
            }

            @Override
            public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
                return content;
            }
        }, (c,t) -> {});
    }

    static void main(String... args) throws Exception {
        var content = readClipBoard();
        writeClipBoard(content);
    }

}
