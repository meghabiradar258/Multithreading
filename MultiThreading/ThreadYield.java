package MultiThreading;

class MyThread10 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("child thread");
            Thread.yield();
        }
    }
}
public class ThreadYield {
    public static void main(String[] args) {
        MyThread10 t=new MyThread10();
        t.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main thread");
        }
    }
}
