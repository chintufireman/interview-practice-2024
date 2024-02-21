package Thread;

public class ProducerConsumer {
    public static void main(String[] args) throws Exception {
        Q lock = new Q();
        Producer p = new Producer(lock);
        Consumer c = new Consumer(lock);

        p.start();
        c.start();
    }
}
class Q {
    int i=0;

    void setI(int num){
        this.i=num;
    }
    int getI(){
        return this.i;
    }
}
class Producer extends Thread {

    Q lock;

    Producer(Q lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (true) {
                    lock.setI(lock.getI() + 1);
                    System.out.println("Producer produced -> " + lock.getI());
                    Thread.sleep(2000);
                    lock.notify();
                    lock.wait();
                }
            }

        } catch (Exception e) {

        }
    }
}

class Consumer extends Thread {

    Q lock;

    Consumer(Q lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            
            synchronized (lock) {
                while (true) {
                    System.out.println("Consumer consumed -> " + lock.getI());
                    Thread.sleep(1000);
                    lock.notify();
                    lock.wait();
                }
            }

        } catch (Exception e) {

        }
    }
}