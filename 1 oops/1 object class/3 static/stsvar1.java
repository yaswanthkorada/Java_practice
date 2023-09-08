class stsvar {
    static int count =0;

    stsvar() {
        count++;
        System.out.println(count);
    }
}
public class stsvar1 {
    public static void main(String[] args) {
        new stsvar();
        new stsvar();

    }
}
