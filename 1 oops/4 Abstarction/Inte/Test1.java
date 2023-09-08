//interface inheritance
//a class extends a class, an interface extends a interface and a class implements a interface.
interface A{
    void go();
}
interface B extends A{
    void run();
}
public class Test1 implements B {
    public void go() {
        System.out.println("go");
    }
    public void run() {
        System.out.println("run");
    }
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.go();
        t1.run();
    }
}
