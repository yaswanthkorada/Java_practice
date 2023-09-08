import java.util.*;
public class StckClass2 {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<Integer>();
        public boolean isEmpty() {
            return list.size()==0;
        }
        public void push(int data) {
            list.add(data);
        }
        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            return list.remove(list.size()-1);
        }
        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
