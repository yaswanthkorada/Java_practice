//static block which is used to initialize the static data member,
// it is executed before the main method at the time of class loading.
public class stablock {
    static {
        System.out.println("static block invoked");
       
    }
    public static void main(String[] args) {
        System.out.println("hello main");
        
    }
}
