/*
 * Single Abstraction Methode
 * All classes with a single methode can be mapped to a ruunable lambda 
 */
interface S25_Sam {
    static void main(String... args) {
        Runnable r = () -> System.out.println("working");
        new Thread(r).start();
    }
}
