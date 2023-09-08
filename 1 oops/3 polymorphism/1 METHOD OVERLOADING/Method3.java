//performing method overloading through type promotion

public class Method3 {
    static void add(int a,double b) {
        System.out.println(a+b);
    }
    static void add(int a,int b,int c) {
        System.out.println(a+b+c);
    }
    public static void main(String args[]) {
        add(30,20);//here the second literal 20 can be promoted to long
        add(1,2,3);
    }
}
