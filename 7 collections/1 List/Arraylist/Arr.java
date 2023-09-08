import java.util.ArrayList;import java.util.Collections;
public class Arr {
    public static void main(String args[]) {

        //declaring array lists
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();

        //add elements to the array list.
        list.add(10);
        list.add(20);
        list.add(9);

        System.out.println(list);

        //get arrylist element
        int a = list.get(2);
        System.out.println(a);

        //add element at specific position
        list.add(1,17);
        System.out.println(list);

        //set element 
        list.set(0,30);
        System.out.println(list);

        //delete a element
        list.remove(2);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for(int i:list) {
            System.out.print(i+" ");
        }
        System.out.println();

        //sorting arraylist
        Collections.sort(list);
        System.out.println(list);
    }
}