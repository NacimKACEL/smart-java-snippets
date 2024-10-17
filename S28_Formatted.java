/*
 * Util pour remplacer des values dans la génération des json object .
 */
interface S28_Formatted {
    static void main(String... args) {
        var message = """
                hey, %s. You are older than %d
                """.formatted("duke", 18);
        System.out.println(message);
    }
}
