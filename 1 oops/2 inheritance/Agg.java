class Address {
    String city,state;
    Address(String c,String s) {
        city=c;
        state=s;
    }
}
public class Agg {
    int id;
    String name;
    Address add;
    Agg(int i,String n,Address a) {
        id=i;
        name=n;
        add=a;
    }
    void display() {
        System.out.println(id+" "+name+" "+add.city+" "+add.state);
    }
    public static void main(String[] args) {
        Address a1=new Address("vzm", "Ap");
        Agg s1=new Agg(1,"teja",a1);
        s1.display();
    }

}
