class A {
    void show() {
        System.out.println("running in a");
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj = new A(){
            void show() {
                System.out.println("Hello guys");
            }
        };
        obj.show();
    }
}