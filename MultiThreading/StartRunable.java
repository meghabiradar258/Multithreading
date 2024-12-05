package MultiThreading;

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("child runnable");
    }
}
public class StartRunable {
    public static void main(String[] args) {
        MyRunnable2 r=new MyRunnable2();
        Thread t=new Thread(r);
        t.start();
        System.out.println("main thread");
    }
}
