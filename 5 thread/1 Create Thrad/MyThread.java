//a thread is a part of a process or part of a program.a thred is light weight because it uses less resources to communicate.thread share same address space.
//the context switching (storing the state of the thread) of thread is low cost.inter thread communication cost is low.
// using Thread class to create a Thread.
public class MyThread extends Thread{
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread "+i);
        }
    }
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        t1.start();
    }
}
