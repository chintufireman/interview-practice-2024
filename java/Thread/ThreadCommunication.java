package Thread;
public class ThreadCommunication {
    public static void main(String[] args) {
        // Create a common lock object
        Object lock = new Object();

        Process1 p1 = new Process1(lock);
        Process2 p2 = new Process2(lock);
        p1.start();
        p2.start();

        try {
            p1.join(); // Wait for Process1 to finish
            p2.join(); // Wait for Process2 to finish
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Process1 extends Thread {
    private final Object lock;

    public Process1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            // Sleep to give Process2 a chance to acquire the lock
            synchronized (lock) {
                Thread.sleep(5000);
                System.out.println("Process1 generated -> " + Process2.giveNumber());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static double giveNumber() {
        return Math.random();
    }
}

class Process2 extends Thread {
    private final Object lock;

    public Process2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                Thread.sleep(5000);
                System.out.println("Process2 generated -> " + Process1.giveNumber());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static double giveNumber() {
        return Math.random();
    }
}
