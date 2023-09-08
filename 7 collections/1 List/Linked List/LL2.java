import java.util.*;
public class LL2 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);list.add(5);list.add(7);list.add(3);list.add(8);list.add(2);list.add(3);
        for(int i=0;i<list.size();i++) {
            if(list.get(i)==7) {
                System.out.println("The element found at index position :"+i);
                break;
            }
        }
        System.out.println(list);
    }
}
