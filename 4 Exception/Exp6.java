//try with multiple catch block.
public class Exp6 {
    public static void main(String[] args) {
        try{
            int a[]={1,2,21,4};
            a[2]=10/0;
            System.out.println("bye");
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some thing went wrong  "+e);
        }
        finally{
            System.out.println("good night");
        }
    }
}
