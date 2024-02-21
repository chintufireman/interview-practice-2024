package Thread;
public class DaemonThread {
    public static void main(String[] args) {

        ThreadClass t = new ThreadClass();
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread "+i);
        }
    }
}


class ThreadClass extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("Thread CLass "+i);
        }
    }
    
}