//super keyword can be used to invoke immediate parent class constructor
class A {
    A() {
        System.out.println("Super man");
    }
}
class B extends A {
    B() {
        super();
        System.out.println("day ");
        
    }
}
public class Test3 {
    public static void main(String[] args) {
        new B();
    }
}
