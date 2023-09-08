package Synchronization;
class Table {
    public synchronized void print(int n) {
        for(int i=1;i<=5;i++)
        {
            System.out.println(n*i);
        }
    }
}
class A extends Thread {
    Table t;
    A(Table t) {
        this.t=t;
    }
    public void run() {
        t.print(5);
    }
}
class B extends Thread {
    Table t;
    B(Table t) {
        this.t=t;
    }
    public void run() {
        t.print(100);
    }
}
public class Sync1 {
    public static void main(String[] args) throws InterruptedException {
        Table obj = new Table();
        A t1=new A(obj);
        B t2 = new B(obj);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}
