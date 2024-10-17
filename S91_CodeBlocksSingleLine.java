import java.util.HexFormat;

interface S91_CodeBlocksSingleLine {

    static void main(String... args) {
        var hexNumber = """
                CAFEBABE\
                BABECAFE\
                """;
        var parsed = HexFormat.of()
            .parseHex(hexNumber);
        System.out.println(parsed.length);
    }
}
