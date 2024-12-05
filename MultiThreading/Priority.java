package MultiThreading;
class MyThread6 extends Thread{

}

public class Priority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(17);  //Runtime Exception range from only 1 to 10
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());
    }
}
