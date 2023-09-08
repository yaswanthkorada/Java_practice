//the compareTo method string class used to compare string values lexicographically and returns integer value.
/* s1 == s2 returns 0
 * s1>s2 returns a positive value 1
 * s1<s2 returns a negative value -1
 */
public class Compare {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 ="Sachin";
        String s3="Tavi";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s2));
    }
}
