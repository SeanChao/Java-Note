import java.util.concurrent.*;

public class CachedThreadPool {
    public static void main(String[] args) {
        // ExecutorService exec = Executors.newCachedThreadPool();
        ExecutorService exec = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown(); // shut down after all the tasks finished
        
    }
}