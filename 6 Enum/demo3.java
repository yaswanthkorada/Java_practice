//for lopp for enum class
//values() method returns a array of enum constants which used to iterate over the elements.
enum Level {
    LOW,MEDIUM,HIGH;
}
public class demo3 {
    public static void main(String[] args) {
        for(Level my :Level.values()) 
            System.out.println(my);
        
    }
}
