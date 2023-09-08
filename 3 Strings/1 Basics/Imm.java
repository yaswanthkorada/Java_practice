//here s1 is not updated because strings are immutable,when we concated teja to s1 
//string a new object is created.but s1 still refers to the value Hello rather than Hello Teja.
public class Imm {
    public static void main(String args[]) {
        String s1 ="Hello";
        s1.concat(" Teja");
        System.out.println(s1);

    }
}
