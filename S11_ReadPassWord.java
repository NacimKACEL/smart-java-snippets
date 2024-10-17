interface S11_ReadPassWord {
    static void main(String... args) {
        var console = System.console();
        var chars = console.readPassword("pwd>");
        System.out.println(chars);
    }
}
