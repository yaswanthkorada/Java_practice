class Employee{
    int id;
    String name;
    float salary;
}
class programmer extends Employee{
    float bonus;
    void insert(int i,String n,float s,float b) {
        id=i;
        name=n;
        salary=s;
        bonus=b;
    }
    void display() {
        System.out.println(id+name+salary+bonus);
    }
}
public class test1 {
    public static void main(String[] args) {
        programmer p1=new programmer();
        p1.insert(1,"Teja",12000,13000);
        p1.display();
    }
}