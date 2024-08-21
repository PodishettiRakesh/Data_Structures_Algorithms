public class LinkedList{
    node head;

    class node {
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void append(int data){
        if(head==null){
            head=new node(data);
            return;
        }

        node current= head;
        while(head.next!=null){
            current=current.next;
        }
        node nextNode=new node(data);
        current.next=nextNode;
    }

    public static void main(String[] args){
        LinkedList obj= new LinkedList();
        
    }

    
}