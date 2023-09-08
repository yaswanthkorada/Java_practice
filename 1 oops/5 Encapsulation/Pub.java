//the access level of public modifier is with in the class outside the class,with in the package outside the package.
class A {
    public int a=10;
    public void run() {
        System.out.println("Running");
    }
}
public class Pub {
    public static void main(String[] args) {
        A obj = new A();
        obj.run();
        System.out.println(obj.a);
    }
}
