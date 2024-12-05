package MultiThreading;

class MyThread2 extends Thread{
    public void run(){
        System.out.println("no-args run");
    }
    public void run(int i){
        System.out.println("int-args run");
    }
}
public class OverlloadingThread {
    public static void main(String[] args) {
        MyThread2 t=new MyThread2();
        t.start();  //calls run() method
    }
}
