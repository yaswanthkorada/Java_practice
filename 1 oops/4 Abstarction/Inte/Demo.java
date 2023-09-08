//multiple inheritance
interface A {
    void run();
}
interface B {
    void show();
 }
public class Demo implements A,B {
    public void run() {
        System.out.println("runnning");
    }
    public void show() {
        System.out.println("showing");
    }
    public static void main(String args[]) {
        Demo d1 = new Demo();
        d1.run();
        d1.show();
    }
}
