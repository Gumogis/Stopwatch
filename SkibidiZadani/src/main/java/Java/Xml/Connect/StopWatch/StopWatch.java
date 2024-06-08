package Java.Xml.Connect.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean running;

    public void start() {
        startTime = System.currentTimeMillis();
        running = true;
        System.out.println("Stopwatch started.");
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        running = false;
        System.out.println("Stopwatch stopped.");
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = System.currentTimeMillis() - startTime;
        } else {
            elapsed = endTime - startTime;
        }
        return elapsed;
    }

}
