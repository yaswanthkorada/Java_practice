//Method over loading through by changing the data type

public class Method2 {
    static void add(int a,int b) {
        System.out.println(a+b);
    }
    static void add(double a,double b) {
        System.out.println(a+b);
    }
    public static void main(String args[]) {
        add(1,2);
        add(12.2,13.2);
    }
}
