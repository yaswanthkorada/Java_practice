//connecting  a method call to a method body is called as binding.
//dynamic binding means the type of the object is determined at the run time is called Dynamic binding or late binding.
class A {
    void run() {
        System.out.println("hi teja");
    }
}
public class Dyn extends A {
    void run() {
        super.run();
        System.out.println("i am calling from he method");
    }
    public static void main (String args[]) {
        A a1 =new Dyn();
        a1.run();
    }
}
