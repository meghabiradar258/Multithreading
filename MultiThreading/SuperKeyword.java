package MultiThreading;

class MyThread5 extends Thread{
    public void start(){
        super.start();
        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        MyThread5 t=new MyThread5();
        t.start();
        System.out.println("main");
    }
}
