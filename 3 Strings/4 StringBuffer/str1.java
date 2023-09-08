//capacity method. the initial capacity of string buffer classis 16 it we add string then then 
//its capacity will be incresed o length of the string plus initial 16 capacity.
class str1 {
    public static void main(String args[]) {
        StringBuffer sc = new StringBuffer();
        System.out.println(sc.capacity());
        StringBuffer sc1 = new StringBuffer("Teja");
        System.out.println(sc1.capacity());
        System.out.println(sc1.length());
    }
}