class Method {
    void msg(String a) {
        System.out.println("hi "+a);
    }
}
class Method1 extends Method{
    void msg(String a) {
        System.out.println("hello "+a);
    }
    public static void main(String[] args) {
        Method1 m1 = new Method1();
        m1.msg("teja");
        
    }
}