import java.util.TimerTask;
import java.util.Timer;

// Introduced since java 1.3

interface S04_Timer {
    static void main(String... args) {
        var task = new TimerTask() {
            @Override
            public void run() {
                System.err.println("working");
            }
        };

        var timer = new Timer();
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
