import java.util.stream.Collectors;

interface S86_StringToCsv {

    static void main(String... args) {
        var csv = """
                Mr. KACEL
                JavaOne Avenue
                4242 JAVAPOLIS
                """.lines()
                .collect(Collectors.joining(","));
        System.out.println(csv); 
    }

}
