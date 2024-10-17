import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.lang.InterruptedException;
import java.util.concurrent.ExecutionException;



interface S58_FutureState {

    static String slowMessage() {
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e){
            
        }
        return "dukeGPT";
    }

    static void main(String... args) throws InterruptedException, ExecutionException {
        var future = Executors
            .newCachedThreadPool()
            .submit(S58_FutureState::slowMessage);
        
        System.out.println(future.state());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(future.state());
        System.out.println(future.get());
    }
}
