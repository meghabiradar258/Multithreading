package MultiThreading;

class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("child thread");
        }
    }
}
public class StartVsRun {
    public static void main(String[] args) {
        MyThread1 t=new MyThread1();
        t.start();  //crates new thread
        t.run();    //executes like normal call method
        for (int i = 0; i <10 ; i++) {
            System.out.println("main thread");
        }
    }
}
