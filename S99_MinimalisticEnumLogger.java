import java.io.PrintStream;

interface S99_MinimalisticEnumLogger {

    public enum Log {
        INFO("\033[0;33m", System.out),
        ERROR("\033[0;41m", System.out);

        String template;
        String RESET = "\u001B[0m";
        PrintStream out;

        Log(String color, PrintStream out) {
            this.template = ( color + "%s" + RESET);
            this.out = out;
        }

        public void out(String message) {
            var colored = this.template.formatted(message);
            this.out.println(colored);
        }
    }

    static void main(String... args) {
        Log.INFO.out("Hello, duke");
        Log.ERROR.out("danger");
    }

}
