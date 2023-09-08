public class Methods {
    public static void main(String[] args) {
        String s="Teja";
        String s1="Teja";
        String s2 = "Khan";
        String s4 = new String("teja");
        String s6="  Ravi   ";
        int a=10;
        String s7=String.valueOf(a);
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s.concat(s2));
        String s3=String.format("%s%s",s1,s2);
        System.out.println(s3);
        String s5=String.join("@",s,s2);
        System.out.println(s5);
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s4));
        System.out.println(s1.compareTo(s));
        System.out.println(s4.isEmpty());
        System.out.println(s.contains("Tej"));
        System.out.println(s.startsWith("Te"));
        System.out.println(s.endsWith("ja"));
        System.out.println(s.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s.replace("Te","Ra"));
        System.out.println(s.substring(1));
        System.out.println(s6.trim());
        System.out.println(s7);

    }
}
