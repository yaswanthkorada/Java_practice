//encapsulation basically refers to the hiding of sensitive data and 
//it is also means wrapping up of code and data together into a single unit
//encapsulation can be achieved through making the data members as private and providing public get and set methods to access them.
class A {
    private int age=10;
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name=name;
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.getAge());
        obj.setAge(20);
        obj.setName("Hari");
        System.out.println(obj.getAge()+ " "+obj.getName());
    }
}