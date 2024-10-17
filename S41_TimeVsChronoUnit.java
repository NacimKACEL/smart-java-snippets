import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;
/// TimeUnit we can sleep, Chrono Unit we can have data operation with that  
interface S41_TimeVsChronoUnit {
    static void main(String... args) throws InterruptedException {
        System.out.println("What's the difference ?");
        var tu = TimeUnit.SECONDS;
        tu.sleep(2);
        
        var cu = ChronoUnit.SECONDS;
        System.out.println(cu.getDuration().toMillis());
    }
}
