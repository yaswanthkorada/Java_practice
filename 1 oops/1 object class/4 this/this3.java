//this keyword can be used to invoke current class constructor
class this1 {
    int b;
    this1(){
        this(10);

        System.out.println("this1 constructor called");
    }
    this1(int a){
        
        System.out.println(a);
        
    }
}
public class this3 {
    public static void main(String args[]){
        this1 s1 = new this1();
        s1.b=10;
    }
}
