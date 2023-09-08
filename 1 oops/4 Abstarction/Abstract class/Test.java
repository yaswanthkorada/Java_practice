
abstract class A {
    int age;
    abstract void run(int a) ;
    void go() {
        System.out.println("going");
    }
}
public class Test extends A {
    void run(int a) {
        System.out.println("number "+a+" hello");
    }
    public static void main(String args[]) {
        Test t1 = new Test();
        t1.run(2);
        t1.go();
    }
}
