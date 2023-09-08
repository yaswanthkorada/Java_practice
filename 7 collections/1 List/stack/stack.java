import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        System.out.println(s1.isEmpty());
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        System.out.println(s1);
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1.peek());
        System.out.println(s1.size());
    }
}