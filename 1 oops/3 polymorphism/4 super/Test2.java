//super keyword can be used to invoke immediate parent claas method
class A {
    void run() {
        System.out.println("running");
    }
}
class B extends A {
    void run() {
        super.run();
        System.out.println("towards park");
    }
}
public class Test2 {
   public static void main(String[] args) {
    B b1=new B();
    b1.run();
   }
}
