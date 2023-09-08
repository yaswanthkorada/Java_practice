//initializing an objec throgh construrctor

public class stuc {
    int i;
    String nam;

    stuc(int id,String name) {
        i=id;
        nam=name;
    }
    public static void main(String[] args) {
        stuc s1=new stuc(7,"Teja");
        System.out.println(s1.i+" "+s1.nam);
    }
}
