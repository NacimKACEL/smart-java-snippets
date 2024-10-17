import java.lang.System.Logger.Level;

/*
 * Why to use it ? we are in thr cloud , we have to use 0 dependencies
 */

interface S15_BuiltInLogger {
    static void main(String... args) {
        var log = System.getLogger("nacim");
        log.log(Level.INFO, "hello, world");
        log.log(Level.ERROR, "\033[0;31m"+" ❗ error : fetching data");
        log.log(Level.WARNING, "\033[0;32m"+"  ⚠️ warning : fetching data");
        log.log(Level.DEBUG, "\033[0;33m"+" 😍 success : fetching data"); 
        System.out.println("adfs");

    }
}
