package MultiThreading;

class P{
    public synchronized void d1(Q q){
        System.out.println("Thread 1 starts execution of d1(Q q)method");
        try {
            Thread.sleep(6000);
        }
        catch (InterruptedException e){

        }
        System.out.println("Thread 1 calling Q's last");
        q.last();
    }
    public synchronized void last(){
        System.out.println("Inside P, this is last() method");
    }
}


class Q{
    public synchronized void d2(P p) {
        System.out.println("Thread2 starts execution of d2() method");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {

        }
        System.out.println("Thread 2 trying to call P's last() method");
        p.last();
    }
    public synchronized void last(){
        System.out.println("Inside Q, this is last() method");
    }
}

public class SynchronzedDeadLock extends Thread {
    P p=new P();
    Q q=new Q();
    public void m1(){
        this.start();
        p.d1(q);
    }

    @Override
    public void run() {
        q.d2(p);
    }

    public static void main(String[] args) {
        SynchronzedDeadLock t=new SynchronzedDeadLock();
        t.m1();
    }
}
