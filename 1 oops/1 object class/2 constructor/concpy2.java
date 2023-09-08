//second method for copying values of one object o another is assigning the values of one object to another
public class concpy2 {
    int id;
    String name;
    concpy2(int i,String n) {
        id=i;
        name=n;
    }
    concpy2() {}
    void display() {
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        concpy2 c1=new concpy2(1,"bharath");
        concpy2 c2=new concpy2();
        c2.id=c1.id;
        c2.name=c1.name;
        c1.display();
        c2.display();
    }

}
