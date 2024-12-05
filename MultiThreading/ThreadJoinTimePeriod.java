package MultiThreading;

class MyThread12 extends Thread{
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
public class ThreadJoinTimePeriod {
    public static void main(String[] args) throws InterruptedException {
        MyThread12 t=new MyThread12();
        t.start();
        t.join(10000);
        for (int i = 0; i <10 ; i++) {
            System.out.println("parent thread");
        }
    }
}
