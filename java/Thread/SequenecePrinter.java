package Thread;

public class SequenecePrinter {
    private static int counter = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new SequencePrinter("T1"));
        Thread t2 = new Thread(new SequencePrinter("T2"));
        Thread t3 = new Thread(new SequencePrinter("T3"));

        t1.start();
        t2.start();
        t3.start();
    }

    static class SequencePrinter implements Runnable {
        private final String threadName;

        public SequencePrinter(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (counter > 10) {
                        break; // Exit the loop when counter exceeds 10
                    }
                    if (threadName.equals("T1") && counter % 3 == 1) {
                        System.out.println(threadName + " " + counter++);
                    } else if (threadName.equals("T2") && counter % 3 == 2) {
                        System.out.println(threadName + " " + counter++);
                    } else if (threadName.equals("T3") && counter % 3 == 0) {
                        System.out.println(threadName + " " + counter++);
                    } else {
                        try {
                            lock.wait(); // Wait if it's not this thread's turn
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll(); // Notify other threads to check if it's their turn
                }
            }
        }
    }
}
