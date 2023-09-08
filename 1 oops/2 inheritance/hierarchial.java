//Hierarchial inheritance

class A {
    void msg(){
        System.out.println("Hi");
    }
}
class B extends A {
    void msg1() {
        System.out.println("Hello");
    }
}
class C extends A {
    void msg2() {
        System.out.println("namste");
    }
}
public class hierarchial {
    public static void main(String[] args) {
        C c1 = new C();
        c1.msg();
        c1.msg2();
    }
}
