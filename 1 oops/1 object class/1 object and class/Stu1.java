//main method out side the class

class Stu {
    int id;
    String name;
}
public class Stu1 {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.id=101;
        s1.name="Teja";
        System.out.println(s1.id+" "+s1.name);
    }
}
