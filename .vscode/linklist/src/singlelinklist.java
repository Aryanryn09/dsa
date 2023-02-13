public class singlelinklist {

    private node head;
    private node tail;
    private int size;

public singlelinklist(){
    this.size=0;
}
public void insertfirst(int value){
    node node=new node(value);
    node.next=head;
    head =node;

    if(tail==null){
        tail=head;
    }

    size+=1;
}

    private class node{
        private int value;
        private node next;
        private int size;


        public node(int value) {
            this.value = value;
        }
        public node(int value,node next) {
            this.value = value;
            this.next=next;
        }




    }
}
