//Anonymous simply means nameless,it is not neccessary to declare an array while passing it in a method.
public class Anony {
    static void show(int a[]) {
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]) {
        show(new int[]{1,2,3,4,5,6,7,8,9});
    }
}
