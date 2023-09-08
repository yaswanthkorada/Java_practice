public class Single1 {
    public static void main(String args[]) {
        int arr[]= {1,2,3,4,5,6};
        int sum=0;
        for(int i:arr) {
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println("\nthe sum of array elements is : "+sum);
    }
}
