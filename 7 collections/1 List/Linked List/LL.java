import java.util.*;
class LL {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        //adding elements into list
        list.add("Is");
        list.addFirst("This");
        list.addLast("List");
        list.add(2,"a");

        //printing the list
        System.out.println(list);

        //removing a element
        list.removeFirst();
        list.removeLast();
        list.remove(1);

        System.out.println(list);

        //once again adding elements
        list.add("a");
        list.add("List");
        list.addFirst("This");

        //getting list elements
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");

        //size
        System.out.println(list.size());
    }
}