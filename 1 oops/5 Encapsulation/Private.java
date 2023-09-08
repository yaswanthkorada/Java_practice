//The access level of private modifier is with in the class.
//from outside the class,with in the package ,outside the package it canno be accessed.
public class Private {
    private int age =10;
    public static void main(String[] args) {
        Private p1 = new Private();
        System.out.println(p1.age);
    } 
}
