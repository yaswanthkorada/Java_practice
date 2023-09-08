//a string in java is an object that represents the sequence of characters.String class implements Serializable,comparable and charsequence interfaces.
//ways to create string
class Demo {
    public static void main(String args[]) {
        String s1 = new String("Teja");
        String s2 = "Teja";
        char ch[] = {'a','b','c'};
        String s3 = new String(ch);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

    }
}