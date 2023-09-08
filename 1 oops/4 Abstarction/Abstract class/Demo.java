//Abstarction simply means showing the essential things to the user and hiding the internal from the users.
/** Abstract class : the class which is declared with the abstract keyword is known as an abstract class which is used to achieve abstraction.
 * points to remember
 * 1.the abstract clas is declared with the abstract keyword
 * 2.the abstract class can have abstract and non abstract methods.
 * 3.it can have constructors static and final methods.
 * 4.it cannot be instantiated.
 * 5.it needs to be extened and implemented.
 **/
abstract class A {
    abstract void run();
}

class Demo extends A {
    void run() {
        System.out.println("running");
    }
    public static void main(String args[]) {
        Demo d1 = new Demo();
        d1.run();
    }
}