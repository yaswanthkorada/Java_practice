public class clone {
    public static void main(String args[]) {
        int a[]={12,17,18,15};
        for(int i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
        int b[]=a.clone();
        for(int i:b) {
            System.out.print(i+" ");
        }
        System.out.println("is they both are equal "+(a==b));

    }
}
