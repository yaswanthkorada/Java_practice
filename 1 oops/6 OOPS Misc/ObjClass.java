
public class ObjClass{
    public static void main(String[] args) {
        ObjClass s1 = new ObjClass();

        
        System.out.println("the toSTring method : "+s1.toString());
        System.out.println(s1.equals(s1));
        System.out.println(s1.hashCode());
        System.out.println(s1.getClass());
    }
}