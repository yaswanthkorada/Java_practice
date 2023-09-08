//user Defined Exception.
class TejaException extends Exception{
 public TejaException(String s) {
    super(s);
 }
}
public class Exp11 {
    public static void main(String[] args) {
        try{
            int age=15;
            if(age<15) {
                throw new TejaException("user Defined Exception");
            }
            else {
                System.out.println("eligible to vote");
            }
        }
        catch(TejaException e) {
            System.out.println("caught Exception \n"+ e);
        }
    }
}
