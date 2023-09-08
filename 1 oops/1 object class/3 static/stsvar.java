//static variable

class sta {
    int id;
    String name;
    static String clgname="liet";
    sta (int i,String n) {
        id=i;
        name=n;
    }
    void display() {
        System.out.println(id+" "+name+" "+clgname);
    }
}
public class stsvar {
    public static void main(String[] args) {
        sta s1=new sta(1,"teja");
        sta s2=new sta(2,"bharath");
        //we can change the static varaible 
        sta.clgname="Mvgr";
        s1.display();
        s2.display();
    }
}