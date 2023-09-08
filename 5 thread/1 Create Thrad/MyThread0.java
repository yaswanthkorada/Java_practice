//we create a thread by using runnable interface.
class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("Thread "+i);
        }
    }
}
public class MyThread0 {
    public static void main(String[] args) {
        A obj = new A();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
