package MultiThreading;

class Display{
    public synchronized void demo(String name){
        for (int i = 0; i <10 ; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
            System.out.println(name);
        }
    }
}

class Demo extends Thread{
    Display d;
    String name;
    Demo(Display d, String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.demo(name);
    }
}
public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d=new Display();
        Demo t1=new Demo(d, "Megha");
        Demo t2=new Demo(d,"mahi");
        Demo t3=new Demo(d,"jayesh");
        Demo t4=new Demo(d,"mahesh");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
