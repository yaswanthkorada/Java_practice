class Even extends Thread {
    public void run() {
        System.out.println("The even Numbers are : ");
        for(int i=0;i<=10;i=i+2) {
            System.out.println(i);
        }
    }
}
class Odd extends Thread {
    public void run() {
        System.out.println("The Odd Numbers are : ");
        for(int i=1;i<=10;i=i+2) {
            System.out.println(i);
        }
    }
 }
public class EvOd {
    public static void main(String args[]) {
        Even t1 = new Even();
        Odd t2 = new Odd();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.start();

    }
}
