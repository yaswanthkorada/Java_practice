class A {
    int age;
    void run() {
        System.out.println("running");
    }
    class B {
        public void go() {
            System.out.println("going");
        }
    }
}
class Inner {
    public static void main(String[] args) {
        A obj = new A();
        obj.age=10;
        System.out.println(obj.age);
        obj.run();
        A.B b1 = obj.new B();
        b1.go();
    }
}