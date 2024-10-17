interface S29_PositionInFormatted {
    static void main(String... args) {
        var message = """
                hello, %1$s
                question : %2$s
                good by, %1$s
                """.formatted("nacim", "are you developper ?");
        System.out.println(message);
    }
}
