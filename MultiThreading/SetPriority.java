package MultiThreading;
import java.lang.Thread;
class MyThread9 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("child thread");
        }
    }
}
public class SetPriority {
    public static void main(String[] args) {
        MyThread9 t=new MyThread9();
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        for (int i = 0; i <5 ; i++) {
            System.out.println("main thread");
        }
    }
}
