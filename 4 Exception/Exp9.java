//the throw keyword in java is used to throw an custom exception .
//when we throw an unchecked exception it is not required to maintain a try catch block.
public class Exp9 {
    void checkAge(int age){
        if(age<18) {
            throw new ArithmeticException("You are not eligible for vote");
        }
        else {
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String[] args) {
        Exp9 obj = new Exp9();
        obj.checkAge(15);
       
    }
}
