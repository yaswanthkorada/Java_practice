//static method
class sts{
    int id;String name;
    static String clgname="Liet";
    static void change() {
        clgname="Anits";
    }
    sts(int i,String n) {
        id=i;name=n;
    }
    void display() {
        System.out.println(id+" "+name+" "+clgname);
    }
}
public class stamet {
    public static void main(String[] args) {
        sts s1 =new sts(1,"Teja");
        s1.display();
        sts.change();
        sts s2= new sts(2,"lucy");
        
        s2.display();
    }
}
