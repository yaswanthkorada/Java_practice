

//when we throw an checked exception it is mandatory to maintain a try catch block because these have to be checked at compile time.
//here we are using throws keyword which is used to declare an exception means it specifies that there may be a chance to occur exception.
public class Exp10 {
    void check() throws ArithmeticException{
        int a=10/0;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Exp10 o= new Exp10();
        try{
            o.check();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
    }
}
