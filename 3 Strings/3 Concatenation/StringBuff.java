public class StringBuff {
    public static void main(String args[]) {
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer(" Ravi");
        StringBuffer s = s1.append(s2);
        System.out.println(s);
    }
}
