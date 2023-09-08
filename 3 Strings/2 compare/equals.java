//the string can be compared by using equals method the equals method is used to compare string depending on their values.
public class equals {
    public static void main(String args[]) {
        String s1 ="Sachin";
        String s2 = "Sachin";
        String s3= new String("Sachin");
        String s4 ="Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}