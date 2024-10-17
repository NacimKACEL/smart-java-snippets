public interface S12_CustomJVM {
    /*
     * javac
     * jdeps
     * jlink --add-modules java.base --output cobab
     * Create a custom JVM with only needed modules
     */
    static void main(String... args) {
        System.out.println("hey, nacim ");

    }

}
