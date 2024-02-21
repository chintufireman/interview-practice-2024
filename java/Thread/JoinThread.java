package Thread;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread = new JoinThread();
        joinThread.startThreads();
    }

    private void startThreads() throws InterruptedException {
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    System.out.println("Thread 1: " + i);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    System.out.println("Thread 2: " + i);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();

        // Ensure one of the threads starts first
        Thread.sleep(10);

        synchronized (lock) {
            lock.notify();
        }

        t1.join();
        t2.join();

        System.out.println("Both threads have finished their execution.");
    }
}
