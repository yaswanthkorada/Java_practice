// instance initializer block is used to intialize the instance data members.
public class Inst1 {
    Inst1() {
        System.out.println("constructor is called");
    }
    {
        System.out.println("Iib is invoked");
    }
    public static void main(String[] args) {
        Inst1 s1 = new Inst1();
        Inst1 s2 = new Inst1();
    }
}
