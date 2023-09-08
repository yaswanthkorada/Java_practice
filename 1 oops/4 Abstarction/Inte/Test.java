interface Printable {
    void go();
}
class Test implements Printable {
    public void go(){
        System.out.println("going");
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.go();
    }
}