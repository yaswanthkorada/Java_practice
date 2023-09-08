//this keyword can be used to refer to the current class instance variable

class student {
    int id;String name;
    student(int id,String name) {
        this.id=id;
        this.name=name;
    }
    void display() {
        System.out.println(id+" "+name);
    }

}
public class this1 {
    public static void main(String[] args) {
        student s1=new student(1,"teja");
        s1.display();
    }
}