//initializing an object through method
class Student {
    String name;
    int age;
    public void getDetails(String n,int m) {
        name=n;
        age=m;
    }
    void display() {
        System.out.println(name+" "+age);
    }
}
public class stub {
    public static void main(String[] args) {
        {
            Student s1=new Student();
            s1.getDetails("teja",19);
            s1.display();
        }
    }
}
