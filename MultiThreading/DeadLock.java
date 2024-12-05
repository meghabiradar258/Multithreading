package MultiThreading;

class MyThread14 extends Thread{
    static Thread mt;
    @Override
    public void run() {
        try {
            mt.join();
        }
        catch (InterruptedException e){
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println("child thread");
        }
    }
}
public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        MyThread14.mt=Thread.currentThread();
        MyThread14 t1=new MyThread14();
        t1.start();
        t1.join();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main thread");
        }
    }
}

class DeadLock2{
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}
