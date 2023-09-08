class A extends Thread {
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("thread 1 is invoked");
           
        }
    }
}
class B extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread 2 invoked");
           
        }
    }
}
public class Threa {
    public static void main(String args[]) {
        A obj = new A();
        B obj1 = new B();
        obj.start();
        try {
            obj.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj1.start();
        try {
            obj1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}