import java.util.regex.*;
class Demo {
    public static void main(String[] args) {
        //1 way
        Pattern p = Pattern.compile(".n.");
        Matcher m = p.matcher("and");
        boolean b = m.matches();
        System.out.println(b);

        //2 Way

        boolean c = Pattern.compile(".n").matcher("an").matches();
        System.out.println(c);

        //3 way
        String chr = "v";
        System.out.println(Pattern.matches("[^abyc]",chr));
    }
}