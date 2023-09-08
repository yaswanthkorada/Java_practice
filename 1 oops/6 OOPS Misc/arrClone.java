
public class arrClone {
    public static void main(String args[]) {
        int arr[]= {1,23,4,6};
        int arr1[]=arr.clone();
        System.out.println("the arrsy created");
        for(int i:arr) {
            System.out.print(i+" ");
        }
        for(int k:arr1) {
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println(arr1.equals(arr));
        System.out.println(arr==arr1);
    }
}
