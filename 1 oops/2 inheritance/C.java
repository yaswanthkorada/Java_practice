//multi level inheritance

class A {
    void msg() {
        System.out.println("in A");
    }
}
class B extends A {
    void msg1() {
        System.out.println("in B");
    }
}

public class C extends B{
    void msg2() {
        System.out.println("in C");
    }
    public static void main(String[] args) {
        C c1=new C();
        c1.msg();
        c1.msg1();c1.msg2();
    }
}
