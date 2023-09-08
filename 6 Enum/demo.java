//enum is a special class which consists of a set of constatnts(unchangeable or the constants are final)
//Enum outside the class
enum Level {
    LOW,MEDIUM,HIGH;
}
class demo {
    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        System.out.println(myVar);
    }
}