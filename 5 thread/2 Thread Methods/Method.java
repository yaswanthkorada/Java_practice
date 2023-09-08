//methods of a thread class
public class Method extends Thread{
    public void run() {
        try {
           Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        
        for(int i=0;i<6;i++) {
            System.out.println(i);
        }
    }
    public static void main(String args[]) {
        Method t1 = new Method();
        t1.start();
        System.out.println("Thread id "+t1.getId());
        System.out.println("Thread Current"+Method.currentThread().getName());
        System.out.println("Thread Name "+t1.getName());
        t1.setName("Hari");
        System.out.println("Thread Name "+t1.getName());
        System.out.println("Thread priority "+t1.getPriority());
        t1.setPriority(10);
        System.out.println("ThreadPriority "+t1.getPriority());
        try{
            t1.join();
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread 2 is created");
        Method t2 = new Method();
        t2.start();
    }
}
