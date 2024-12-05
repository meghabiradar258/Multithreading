package MultiThreading;

class MyThread8 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class GetName {
    public static void main(String[] args) {
        MyThread8 t=new MyThread8();
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
