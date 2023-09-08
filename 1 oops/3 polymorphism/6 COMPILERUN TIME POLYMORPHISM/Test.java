//Run time polymorphism is achieved through method over riding.the jvm decides which method to be called at the run time.
//Up casting means the reference of a prent class refers to the object of the child class.
class A {
    void run() {
        System.out.println("class a");
    }
}
class B extends A {
    void run() {
        System.out.println("class B");
    }
    
    
}
public class Test {
    public static void main(String[] args) {
        A b1 = new B();
        b1.run();
    }
}
