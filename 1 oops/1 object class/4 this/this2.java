// this keyword can be used to invoke the current class method
class this1 {
    void m() {
        System.out.println("hello m");
    }
    void n() {
        System.out.println("hello n");
        this.m();
    }
}
public class this2 {
    public static void main(String[] args) {
        this1 s1=new this1();
        s1.n();
    }
}
