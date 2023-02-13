package linkedlist;

public class LL {
    private Node head;
    private Node tail;
    public int size;

    public LL(){
        this.size=0 ;
    }
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next  = head;
        head = node;
        if(tail==null){
            head=tail;
        }
            size +=1;
    }

    public void insertlast(int val){
        if(tail==null){
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size +=1;
    }

    public void insertindex(int val ,int index){
        if(index ==0){
            insertfirst(val);
        return;
        }
        if(index==size){
            insertlast(val);
        return;
        }

        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        Node node= new Node(val , temp.next);
        temp.next= node;
        size ++;
    }

    public void deletefirst(){
        int val =head.value;
        head = head.next;

    if (head==null) {
        tail=null;
}
    size--;
    }


    public



    public void display(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.value+" --> ");
            temp =temp.next;
        }
        System.out.println("this called the end of debate");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
