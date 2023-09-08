//Nested try
public class Exp7 {
    public static void main(String[] args) {
        try {
            System.out.println("outer try");
            try {
                System.out.println("Inner try 1");
                int a=10/0;
                System.out.println(a);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            try {
                System.out.println("InnerTry 2");
                int arr[]=new int[3];
                arr[4]=5;
            }
            catch(NullPointerException e) {
                System.out.println(e);
            }

        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
