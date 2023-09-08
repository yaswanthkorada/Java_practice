// the == operator is use d to compare strings depending on their references not on values.
public class Refer {
    public static void main(String[] args) {
        String s1 ="Sachin";
        String s2 ="Sachin"; //here s1 and s2 will have same reference.
        String s3 = new String("Sachin"); //s3 refers to the instance created in nonpool area.
        System.out.println(s1==s2);
        System.out.println(s1==s3); 
    }
}
