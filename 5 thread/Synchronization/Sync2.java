package Synchronization;
class Table {
    public synchronized void print(int n) {
        for(int i=1;i<=6;i++) {
            System.out.println(n*i);
        }
    }
}
public class Sync2 {
    public static void main(String[] args) throws InterruptedException {
        Table obj = new Table();
        Runnable obj1 = new Runnable() {
            public void run() {
                obj.print(100);
            }
        };
        Runnable obj2 = new Runnable() {
            public void run() {
                obj.print(5);
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
