package Synchronization;

class Counter {
    int c;
    synchronized void increment() {
        c+=1;
    }
}

public class Sync {
    public static void main(String[] args) throws InterruptedException{
        Counter obj = new Counter();
        Runnable obj1 = new Runnable() {
            public void run() {
                for(int i=0;i<2000;i++) {
                    obj.increment();
                }
            }
        };
        Runnable obj2 = new Runnable() {
            public void run() {
                for(int i=0;i<2000;i++) {
                    obj.increment();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj.c);
    }
}
