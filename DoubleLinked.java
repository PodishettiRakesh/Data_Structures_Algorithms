public class DoubleLinked {
    node head;

    class node{
        int data;
        node prev;
        node next;

        node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    public void append(int data){
        if(head==null){
            head=new node(data);
            return;
        }

        node current=head;
        while(current.next!=null){
            current=current.next;
        }
        node newNode= new node(data);
        current.next=newNode;
        newNode.prev=current;
    }

    public void dispalyElements(){
        node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            
            current=current.next;
        }
        System.out.println();

    }

    public void reverseList(){
        // if(head==null || head.next==null){
        //     return;
        // }

        node current=head;
        node temp=null;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoubleLinked obj=new DoubleLinked();
        obj.append(1);
        obj.append(2);
        obj.append(3);
        obj.dispalyElements();
        obj.reverseList();
        obj.dispalyElements();
        
    }
}
