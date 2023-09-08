//parameterized constructor

public class con2 {
    int id ;
    String name;
    con2(int i,String j) {
        id=i;
        name=j;
    }
    public static void main(String args[]) {
        con2 c1 = new con2(1,"Teja");
        System.out.println(c1.id+" "+c1.name);
    }
}
