public class Exp8 {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int arr[]= new int[2];
                    arr[4]=8;
                }
                catch(ArithmeticException e) {
                    System.out.println(e);
                }
            }
            catch(NullPointerException e) {
                System.out.println(e);
            }
        }
        catch(Exception e) {
            System.out.println("HI");
        }
    
    }
}
