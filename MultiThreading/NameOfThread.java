package MultiThreading;

class MyThread7 extends Thread{

}
public class NameOfThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread7 t=new MyThread7();
        System.out.println(t.getName());
        Thread.currentThread().setName("abcd");
        System.out.println(Thread.currentThread().getName());
    }
}
