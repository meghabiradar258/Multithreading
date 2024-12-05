package MultiThreading;

class MyThread11 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("child thread");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
        }
    }
}
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread11 t=new MyThread11();
        t.start();
        t.join();
        for (int i = 0; i <10 ; i++) {
            System.out.println("parent thread");
        }
    }
}
