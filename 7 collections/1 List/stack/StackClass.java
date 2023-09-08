public class StackClass {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    static class Stack {
        static Node head;
        public static boolean isEmpty() {
            return head==null;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            if(head==null) {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop() {
            if(head==null) {
                return -1;
            }
           Node top=head;
           head=head.next;
           return top.data;
        }
        public static int peek() {
            if(head==null) {
                return -1;
            }
            Node top=head;
           return top.data;
        }
        
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
