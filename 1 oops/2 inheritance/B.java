// single inheritace
class A {
    void msg() {
        System.out.println("called msg");
    }
}
class B extends A {
    void msg1(){
        System.out.println("called msg1");
    }
    public static void main(String[] args) {
        B b1 = new B();
        b1.msg();
        b1.msg1();
    }
}

    

