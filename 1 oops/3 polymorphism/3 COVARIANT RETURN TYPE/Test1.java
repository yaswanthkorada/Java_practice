class A {
    A show() {
        System.out.println("hello teja");
        return this;
    }
}
class B extends A {
    
    B show() {
        super.show();
        System.out.println("hi srikanth");
        return this;
    }
}
class Test1 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
    }
}
