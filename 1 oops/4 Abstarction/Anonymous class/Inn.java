//Anonymous inner class for abstract class
abstract class A {
    abstract void run();
}
public class Inn {
    public static void main(String args[]) {
        A obj = new A() {
            void run() {
                System.out.println("Anonymous inner class");
            }
        };
        obj.run();
    }
}
