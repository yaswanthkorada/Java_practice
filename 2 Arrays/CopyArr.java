//we can copy a array into another by using arraycopy method of Ssytem class.
/* public static void arraycopy(object src,int srcpos,objectdes,int despos,int length) 
 */
public class CopyArr {
    public static void main(String args[]) {
        int a[]={1,2,3,4,5,6,78,9,10};
        int b[]=new int[5];
        System.arraycopy(a,0,b,0,5);
        for(int i:b) {
            System.out.print(i+" ");
        }

    }
}
