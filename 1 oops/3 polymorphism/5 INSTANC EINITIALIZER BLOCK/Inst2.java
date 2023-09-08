// the instance initializer block is invoked after the parent class constructor is invoked in is-a relationship.
class A {
    A() {
        System.out.println("parent class constructor");
    }
}
public class Inst2 extends A {
    Inst2() {
        System.out.println("child class constructor is invoked");
    }
    {
        System.out.println("istance initializer block is invoked");
    }
    public static void main(String args[]) {
        A s1 = new Inst2();
        Inst2 s2 =new Inst2();
    }
}
