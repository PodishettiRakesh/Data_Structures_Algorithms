
public class BinarySearchTree {
    class Node{
        int key;
        Node left;
        Node right;
    
        public Node(int item){
            key=item;
            left=right=null;
        }
    }
    Node root;

    public BinarySearchTree(){
        root=null;
    }

    public void insertNode(int data){
        root=insertNodeabs(root, data);
    }

    public Node insertNodeabs(Node root, int data){
        if(root==null){
            root=new Node(data);
            return root;
        }

        if(root!=null){
            if(data<root.key){
                insertNodeabs(root.left, data);
            }else if(data>root.key){
                insertNodeabs(root.right, data);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree BSTtree=new BinarySearchTree();
        System.out.println(BSTtree.root);
        BSTtree.insertNode(5);
    }
}
