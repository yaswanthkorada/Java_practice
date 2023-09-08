import java.util.*;
public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1);
        s1.add(0,4);
        System.out.println(s1);
    }
}
