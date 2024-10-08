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
        while(current.next!=null){
            current=current.next;
        }
        node nextNode=new node(data);
        current.next=nextNode;
    }

    public void displayList(){
        node current=head;
        if(head==null){
            System.out.println("no nodes present in list");
            return;
        }
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println(current);

    }


    public void insertBeginning(int data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public void insertEnd(int data){
        if(head==null){
            head=new node(data);
            return;
        }

        node newNode = new node(data);
        node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public node reverseList(){
        node current = head;
        node previous=null;
        node next = null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
        

    }

    public static void main(String[] args){
        LinkedList obj= new LinkedList();
        obj.append(3);
        obj.append(5);
        obj.append(6);
        obj.displayList();
        obj.reverseList();
        obj.displayList();
        
    }

    
}