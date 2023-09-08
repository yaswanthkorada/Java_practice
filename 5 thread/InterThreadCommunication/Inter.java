package InterThreadCommunication;
class A extends Thread {
    int total=0;
    public void run() {
        synchronized(this) {
            for(int i=0;i<=10;i++) {
                this.total+=i;
                this.notify();
            }
        }
    }
    
}
public class Inter {
    public static void main(String args[]) throws InterruptedException {
        A t =new A();
        t.start();
        synchronized(t) {
           
            t.wait(); 

            System.out.println(t.total);
            System.out.println("hi");
        }
    }
}
