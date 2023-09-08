import java.util.*;
public class LL1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(50);
        list.add(25);
        list.add(12);
        list.add(28);
        list.add(15);
        System.out.println(list);
        
        //removing elements greater than 25

        for(int i=0;i<list.size();i++) {
            if(list.get(i)>25) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
