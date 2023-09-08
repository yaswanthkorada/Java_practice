// since java8 interface can have default and static methods.
interface A {
    String a="Teja"; // by default public static final datamember
    default void run() {
        System.out.println("hello");
    }
}
public class def implements A{

    public static void main(String[] args) {
        def obj = new def();
        obj.run();
        System.out.println(A.a);
    }
}
