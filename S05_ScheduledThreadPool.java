import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

interface S05_ScheduledThreadPool {
    static void main(String... args) {
        var scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(()-> System.err.println("working"), 0, 1,TimeUnit.SECONDS);
    } 
}
