package MultiThreading;

class Display1{
    public static synchronized void demo(String name){
        for (int i = 0; i <10 ; i++) {
            System.out.print("Good Morning ");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
            System.out.println(name);
        }
    }
}


class Demo1 extends Thread{
    Display1 d;
    String name;
    Demo1(Display1 d, String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.demo(name);
    }
}
public class StaticSynchronized {
    public static void main(String[] args) {
        Display1 d = new Display1();
        Demo1 t1 = new Demo1(d, "Megha");
        Demo1 t2 = new Demo1(d, "mahi");
        Demo1 t3 = new Demo1(d, "jayesh");
        Demo1 t4 = new Demo1(d, "minakshi");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
