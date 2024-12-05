package MultiThreading;

class MyThread13 extends Thread{
    static Thread t;
    @Override
    public void run() {
        try {
            t.join();
        }
        catch (InterruptedException e){

        }
        for (int i = 0; i <10 ; i++) {
            System.out.println("child thread");
        }
    }
}
public class ThreadJoinChild {
    public static void main(String[] args) throws InterruptedException {
        MyThread13.t=Thread.currentThread();
        MyThread13 t1=new MyThread13();
        t1.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main thread");
            Thread.sleep(2000);
        }
    }
}
