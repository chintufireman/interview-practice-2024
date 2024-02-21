package Thread;
public class MultiThreading {
    public static void main(String[] args) {
        UserThread t = new UserThread();
        t.start();

        UserThread2 t2 = new UserThread2();
        Thread thread = new Thread(t2);
        thread.start();
        
        // for (int i = 0; i < 100; i++) {
        //     System.out.println(Thread.currentThread().getName()+"-"+i);
        // }
    }
}
class UserThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("UserThread1 -> "+i);
        }
    }
    
}

class UserThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Userthread2 -> "+i);
        }
    }
    
}