// super keyword can be used to refer immediate parent class instance variable
class A {
    String name="Teja";
}
class B extends A {
    String name="Ravi";
    void display() {
        System.out.println(super.name);
        System.out.println(name);
    }
}
class C extends B {
    String name="vamsi";
    void display() {
        System.out.println(super.name);
        System.out.println(name);
    }
}
class Test1 {
    public static void main(String[] args) {
        B b1=new B();
        b1.display();
        C c1 = new C();
        c1.display();
    }
}