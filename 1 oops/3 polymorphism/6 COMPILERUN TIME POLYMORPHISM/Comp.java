//compile time polymorphism is achieved through method overloading.and which method to call is decided by the compiler.

class A {
    void add() {
        System.out.println("Hello");
    }
    void add(String a) {
        System.out.println("hello "+a);
    }
    void add(int a) {
        System.out.println(a);
    }
}
class Comp {
    public static void main (String args[]) {
        A a1 = new A();
        a1.add();
        a1.add("Teja");
        a1.add(10);
    }
}
