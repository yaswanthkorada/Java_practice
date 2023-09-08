//Exception handling is a mechanism to handle run time errors.to handle exception in java we have to use try and catch block and even finally.
// the try block allows us to define a block of code to be tested if there any error occurs in that blockand throws the exception occured.
//the catch block allows us to define a block of code to be executed if there any error occurs in the try block.
//the finnaly block will be executed irrespective of try and catch block.
public class Exp4 {
    public static void main(String[] args) {
        try{
            int a=10/0;
            System.out.println(a);
            System.out.println("Hello");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Bye");
        }
    }
}
