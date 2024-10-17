interface S76_ConsoleYesNo {

    static boolean yes() {
        return System.console()
                     .readLine("?")
                     .equalsIgnoreCase("y");
    }

    static void main(String... args) {
        if(!yes())
            return;
        System.out.println("confirmed only");
    }

}
