// the instanceof operator(Comparison operator) in java used to test whether the object is an 
//instance of specified type(class,interface) or not. it returns true or false.
class Inst {
    void run() {
        System.out.println("Solitude");
    }
    
    public static void main(String[] args) {
        Inst s1 = new Inst();
        s1.run();
        System.out.println(s1 instanceof Inst);
    }
}
