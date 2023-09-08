public class StringBuild {
    public static void main(String args[]) {
        StringBuilder s1 = new StringBuilder("Heloo");
        StringBuilder s2 = new StringBuilder(" Teja");
        StringBuilder s = s1.append (s2);
        System.out.println(s.toString());
        System.out.println(s.getClass());
    }
}
