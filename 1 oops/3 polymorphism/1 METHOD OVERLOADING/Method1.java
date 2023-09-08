// method overloading through by changing the number of arguments
class Method1 {
    static void add(int a,int b) {
        System.out.println("Hello world : "+(a+b));
    }
    static void add(int a,int b,int c){
        System.out.println("value is : "+(a+b+c));
    }
    public static void main(String args[]) {
        add(1,2);
        add(1,2,3);
    }
}