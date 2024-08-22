public class DoubleLinked {
    node head;

    class node{
        int data;
        node prev;
        node next;

        node(int data){
            this.prev=null;
            this.next=null;
        }
    }

    public void append(int data){
        if(head==null){
            head=new node(data);
        }

        node current=head;
        while(current.next!=null){
            current=current.next;
        }
        node newNode= new node(data);
        current.next=newNode;
        newNode.prev=current;
    }

    public static void main(String[] args) {
        DoubleLinked obj=new DoubleLinked();
        
    }
}
