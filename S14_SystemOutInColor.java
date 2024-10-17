//
interface S14_SystemOutInColor {
    static void main(String... args) {
        System.out.println("\033[0;31m"+" error : hello, nacim");
        System.out.println("\033[0;32m"+" succes : hello, nacim");
        System.out.println("\033[0;33m"+" warning : hello, nacim");
    }
}
