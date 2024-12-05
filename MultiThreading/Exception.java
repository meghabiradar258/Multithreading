package MultiThreading;

class MyThread4 extends Thread{
    @Override
    public void run() {
        System.out.println("run");
    }
}
public class Exception {
    public static void main(String[] args) {
        MyThread4 t=new MyThread4();
        t.start();
        System.out.println("main");
        t.start();
    }
}
