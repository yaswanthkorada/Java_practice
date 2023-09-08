// A jagged array is array of arrays with different number of columns.
public class Jagged {
    public static void main(String args[]) {
        int a[][]={{1,2,3,4},{5,6,7},{8,9}};
        for(int i[]:a) {
            for(int j:i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
