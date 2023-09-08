
public class LL3 {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data) {
        Node newnode = new Node(data);
        if(head==null) {
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }
    public void addLast(String data) {
        Node newnode= new Node(data);
        if(head==null) {
            head=newnode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newnode;
    }
    public void removeFirst() {
        if(head==null){
            System.out.println("List is empty");
        }
        head=head.next;
    }
    public void removeLast() {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null) {
            head=null;
            return;
        }
        Node last = head.next;
        Node second=head;
        while(last.next!=null) {
            last=last.next;
            second=second.next;
        }
        second.next=null;
    }
    void print() {
        Node currNode = head;
       while(currNode!=null) {
        System.out.print(currNode.data+" -> ");
        currNode=currNode.next;
       }
       System.out.println("Null");

    }
    public void size() {
        Node Trace=head;
        int size=0;
        while(Trace!=null) {
            Trace = Trace.next;
            size++;
        }
        System.out.println("The size of the List Is : "+size);
    }
    public static void main(String[] args) {
        LL3 list = new LL3();
        list.addFirst("say");
        list.addFirst("Teja");
        list.addLast("Hello");
        list.removeFirst();
        list.removeLast();
        list.print();
        list.addFirst("Teja");
        list.addLast("Hi");
        list.print();
        list.size();
    }
}
