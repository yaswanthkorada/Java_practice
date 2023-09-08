public class ll4 {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data=data;
            this.next=null;
        }
    }
    //adding elements at starting of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head==null) {
            head= newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //adding elements at he ending of the list
    public void addLast(String data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //delete element at the first
    public void deleteFirst() {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    //delete element at the last
    public void deleteLast() {
        Node lastNode=head.next;
        Node secondLast=head;
        while(lastNode.next!=null) {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void size() {
        Node currNode=head;
        int size=0;
        while(currNode!=null) {
            currNode=currNode.next;
            size++;
        }
        System.out.println("The size is : "+size);
    }
    //reverse a list
    public void reverseit() {
        Node previous = head;
        Node currNode=head.next;
        while(currNode!=null) {
            Node nextNode=currNode.next;
            currNode.next=previous;
            previous=currNode;
            currNode=nextNode;
        };
        head.next=null;
        head=previous;
    }
    public void print() {
        Node currNode=head;
        while(currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        ll4 list = new ll4();
        list.addFirst("guys");
        list.addFirst("Hey");
        list.addLast("hi");
        list.deleteFirst();
        list.deleteLast();
        list.print();
        list.addFirst("Hey");
        list.addLast("hi");
        list.print();
        list.size();
        list.reverseit();
        list.print();
    }
}
