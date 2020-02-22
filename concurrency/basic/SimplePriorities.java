import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable {
    private int countdown = 5;
    private volatile double d; // no optimization
    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true) {
            for (int i = 0; i < 10000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if (--countdown == 0)
                return;
        }
    }

    public String toString() {
        return Thread.currentThread() + ": " + countdown;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
            System.out.println("ADD");
        }
        exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        System.out.println("register");
        exec.shutdown();
    }
}
