
class A implements Cloneable {
    int age;
    String name;
    void show() {
        System.out.println(age+" "+name);
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }public static void main(String[] args) throws CloneNotSupportedException{
        A obj = new A();
        obj.age=10;
        obj.name="Teja";
        System.out.println(obj.age+" "+obj.name);
        A obj1= (A) obj.clone();
        System.out.println(obj1.age+" "+obj1.name);
    }

}
