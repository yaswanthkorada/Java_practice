public class conoverload {
    int id ;
    String name;
    int age;
    conoverload(int i,String n,int a) {
        id=i;
        name=n;
        age=a;
        
    }
    conoverload(int i,String n){
        id=i;
        name=n;
        
    }
    void display() {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String[] args) {
        conoverload c1=new conoverload(1,"bharath",18),
        c2=new conoverload(2,"Aryan");
        c1.display();
        c2.display();
    }
}
