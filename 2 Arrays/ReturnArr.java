public class ReturnArr {
    static int[] getArray() {  //in this method we are returning an array.
        return new int[]{36,42,58,96,78,45,12};
    }
    static void printArray(int arr[]) {
        for(int k:arr) {
            System.out.print(k+" ");
        }
    }
    public static void main(String args[]){
        int a[]=getArray();
        printArray(a);
    }
}
